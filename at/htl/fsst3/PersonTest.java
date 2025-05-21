package at.htl.fsst3;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {

        Person user = new Person("Thomas", "Brandner", LocalDate.of(2025, 2, 26), 182, 97.7);
        System.out.println(user.toString());
        /* user.setDob("13.05.2025");*/
        /*System.out.println(user.toString());
        LocalDate youngest =compareDob(LocalDate.of(2990,2,2),LocalDate.of(2002,2,2));
        System.out.println(youngest);*/
        Person userToo = new Person("Manfred", "Huber", LocalDate.of(1984, 2, 4),182,85);
        System.out.println(userToo.toString());
        double avg = calcAverageAge(user.getAge(), userToo.getAge());
        System.out.println(avg);

        //Whats the users "Sternzeichen"
        double myBmi = user.calcBmi();
        System.out.printf("%.2f",myBmi);
        String zodiac = user.calcZodiacSign();
        System.out.println(zodiac);


    }

    public static LocalDate compareDob(LocalDate a, LocalDate b) {
        return a.isBefore(b) ? a : b;
    }

    public static double calcAverageAge(int... ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }
}
