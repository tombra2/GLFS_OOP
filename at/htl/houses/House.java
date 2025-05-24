package at.htl.houses;

public class House {
private int houseNumber;
private String area;
private String color;
private String owner;

    public House(int houseNumber, String area, String color, String owner) {
        this.houseNumber = houseNumber;
        this.area = area;
        this.color = color;
        this.owner = owner;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseNumber=" + houseNumber +
                ", area='" + area + '\'' +
                ", color='" + color + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
