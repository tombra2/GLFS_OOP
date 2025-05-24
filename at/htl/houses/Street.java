package at.htl.houses;

import java.util.Arrays;

public class Street {
public String name;
private House [] houses = new House[20];

    public Street(String name) {
        this.name = name;

    }

    public void addHouse(House c){
        for (int i = 0; i < houses.length; i++) {
            if (houses[i]== null){
                houses[i]= c;
                break;
            }
        }

    }

    public House[] getHouses() {
        return houses;
    }
    public void removeHouse(int houseNumber){
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getHouseNumber()==houseNumber){
                houses[i]= null;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", houses=" + Arrays.toString(houses) +
                '}';
    }
}
