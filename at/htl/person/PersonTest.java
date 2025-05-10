package at.htl.person;

import java.time.LocalDate;
import java.util.Arrays;

public class PersonTest {
    public static void main(String[] args) {
        String[] firstNames = {"Alexander", "Hararld", "Christoph", "Thomas"};
        String[] lastNames = {"Messern", "Brandner", "Brandner", "Huber"};
        LocalDate[] birthdates = {
                LocalDate.of(1995, 2, 5),
                LocalDate.of(1964, 8, 14),
                LocalDate.of(1990, 1, 31),
                LocalDate.of(1986, 2, 26)
        };
        String[] zipCodes = {"9020", "8712", "8700", "8010"};
        String[] cities = {"Klagenfurt", "Proleb", "Leoben", "Graz"};

        Person[] arr = new Person[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Person(firstNames[i], lastNames[i], birthdates[i], zipCodes[i], cities[i]);

        }

        System.out.println(Arrays.toString(arr));

    }

}
