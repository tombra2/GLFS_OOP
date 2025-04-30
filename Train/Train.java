package Train;

import java.time.LocalDate;
import java.util.ArrayList;

public class Train {

    private String trainName;
    private ArrayList<Waggon> waggons;

    public Train(String trainName) {
        this.trainName = trainName;
        this.waggons = new ArrayList<>();
    }

    public void addWaggon(Waggon w) {
        waggons.add(w);
    }

    public double getTotalWeight() {
        double weight = 99000;
        for (Waggon waggon : waggons) {
            weight += waggon.getWeight();
        }

        return weight;
    }

    public int getAveragePassagners() {
        int sum = 0;
        for (Waggon waggon : waggons) {
            sum += waggon.getPassengers();
        }
        return (int) Math.ceil((double) sum / waggons.size());

    }

    public LocalDate getYearOfEmptiestWaggon() {
        LocalDate lowest = null;
        int min = Integer.MAX_VALUE;
        for (Waggon waggon : waggons) {
            if (waggon.getPassengers() < min) {
                lowest = waggon.getYearOfConstruction();
                min = waggon.getPassengers();
            }
        }
        return lowest;
    }

    @Override
    public String toString() {
        return "Train.Train{" +
                "trainName='" + trainName + '\'' +
                ", waggons=" + waggons +
                '}';
    }
}
