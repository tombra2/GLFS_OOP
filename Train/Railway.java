package Train;

import java.time.LocalDate;

public class Railway {
    public static void main(String[] args) {
        System.out.println("Der Zug der Zug hat keine Bremsen");
        Waggon w123 = new Waggon("w123",20000, LocalDate.of(2000,2,2));
        Waggon w124 = new Waggon("w124", 21100,LocalDate.of(2025,2,1));

        Train ice = new Train("ice");

        w123.enter(3);
        w124.enter(0);
        ice.addWaggon(w124);
        ice.addWaggon(w123);

        System.out.println(ice);

        double weight =ice.getTotalWeight();
        System.out.println(weight);

        int average = ice.getAveragePassagners();
        System.out.println(average);
        LocalDate date = ice.getYearOfEmptiestWaggon();
        System.out.println(date);

        }
        

    }
    


