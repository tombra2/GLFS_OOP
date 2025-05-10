package at.htl.fsst3;

import java.time.LocalDate;

public class PetsTest {
    public static void main(String[] args) {

        Pets delta = new Pets("Delta", "Weiß", LocalDate.of(2021, 12, 5), "MixBreed");

        System.out.println(delta.toString());

        delta.setPetdob("2020-12-05");
        System.out.println(delta.toString());

    }
}
