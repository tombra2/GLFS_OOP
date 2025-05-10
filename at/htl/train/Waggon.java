package at.htl.train;

import java.time.LocalDate;
import java.util.Random;

public class Waggon {
    private String name;
    private int weight;
    private LocalDate yearOfConstruction;
    private int passengers;

    public Waggon(String name, int weight, LocalDate yearOfConstruction) {
        this.name = name;
        this.weight = weight;
        this.yearOfConstruction = yearOfConstruction;
    }

    public Waggon(String name) {
        this.name = name;
        this.weight = 15000;
        this.yearOfConstruction = LocalDate.of(1900, 1, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 0) {
            this.weight = weight * -1;
        } else {
            this.weight = weight;
        }
    }

    public LocalDate getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(LocalDate yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        if (passengers < 0) {
            this.passengers = passengers * -1;
        } else {
            this.passengers = passengers;
        }

    }

    public void enter() {
        this.passengers++;
        Random rnd = new Random();
        this.weight += rnd.nextInt(30, 131);
    }

    public void enter(int passengers) {
        Random rnd = new Random();
        this.passengers += passengers;
        for (int i = 0; i < passengers; i++) {
            this.weight += rnd.nextInt(30, 130);
        }

    }

    @Override
    public String toString() {
        return String.format("|%s|%d|%s|%d Reisende|", this.name, this.weight, this.yearOfConstruction,
                this.passengers);
    }
}
