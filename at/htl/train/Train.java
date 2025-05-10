package at.htl.train;

import java.time.LocalDate;
import java.util.Arrays;

public class Train {
    private final String name;
    private final Waggon[] unitOfWaggons;

    public Train(String name) {
        this.name = name;
        this.unitOfWaggons = new Waggon[10];
    }

    public void addWaggon(Waggon w) {
        for (int i = 0; i < unitOfWaggons.length; i++) {
            if (unitOfWaggons[i] == null) {
                unitOfWaggons[i] = w;
                break;
            }
        }
    }

    public LocalDate getYearOfEmptiestWaggon() {
        int min = Integer.MAX_VALUE;
        LocalDate minPassangerWaggon = LocalDate.now();
        for (int i = 0; i < unitOfWaggons.length; i++) {
            if (unitOfWaggons[i] != null && min > unitOfWaggons[i].getPassengers()) {
                minPassangerWaggon = unitOfWaggons[i].getYearOfConstruction();
                min = unitOfWaggons[i].getPassengers();
            }
        }
        return minPassangerWaggon;
    }

    public int getTotalWeight() {
        int trainWeight = 100000;
        int waggons = 0;
        for (int i = 0; i < unitOfWaggons.length; i++) {
            if (unitOfWaggons[i] != null) {
                waggons += unitOfWaggons[i].getWeight();
            }
        }
        return trainWeight + waggons;
    }

    public double getAveragePassanger() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < unitOfWaggons.length; i++) {
            if (unitOfWaggons[i] != null) {
                sum += unitOfWaggons[i].getPassengers();
                count++;
            }

        }
        double scala = Math.pow(10,0);
        double avg = (double) sum/count;
        return Math.round(avg*scala)/scala;
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", unitOfWaggons=" + Arrays.toString(unitOfWaggons) +
                '}';
    }
}
