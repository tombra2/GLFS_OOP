package at.htl.train;

import java.time.LocalDate;

public class Railway {
    public static void main(String[] args) {

        Waggon w123 = new Waggon("w123", 15000, LocalDate.of(2020, 1, 1));
        Waggon w456 = new Waggon("w456", 15001, LocalDate.of(2025, 4, 4));
        Waggon w789 = new Waggon("w789", 15002, LocalDate.of(2024, 3, 4));

        Train ice359 = new Train("ice350");

        System.out.println(ice359.toString());
        ice359.addWaggon(w123);
        ice359.addWaggon(w456);
        ice359.addWaggon(w789);
        w123.enter(6);
        int w1 = w123.getPassengers();
        System.out.println(w1);
        w456.enter(5);
        w789.enter(3);
        int total = ice359.getTotalWeight();
        System.out.println(total);

        double avg = ice359.getAveragePassanger();
        LocalDate min = ice359.getYearOfEmptiestWaggon();
        System.out.println(min);
        System.out.println(avg);
    }
}
