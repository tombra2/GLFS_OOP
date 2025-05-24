package at.htl.houses;


import java.util.ArrayList;

public class City {
    public static void main(String[] args) {
        ArrayList<Street>proleb = new ArrayList<>();

        Street raikasiedlung = new Street("Raikasiedlung");
        House brandner = new House(4,"Proleb","beige","Brandner");
        House maier = new House(5,"Proleb","red","Maier");
        House huber = new House(6,"Proleb","gray","Huber");
        raikasiedlung.addHouse(brandner);
        raikasiedlung.addHouse(maier);
        raikasiedlung.addHouse(huber);
        Street peterTunner = new Street("Pete-Tunner-Straße");
        Street bergmann = new Street("Bergmanngasse");
        proleb.add(raikasiedlung);
        proleb.add(peterTunner);
        proleb.add(bergmann);
        for (Street pro : proleb){
            System.out.println(pro.toString());
        }

        raikasiedlung.removeHouse(4);


        for (Street pro : proleb){
            System.out.println(pro.toString());
        }






    }
}
