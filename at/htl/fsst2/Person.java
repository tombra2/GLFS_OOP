package at.htl.fsst2;

import java.time.LocalDate;

public class Person {
    private String vorname;
    private String nachname;
    private LocalDate dob;

    public Person(String vorname, String nachname, LocalDate dob) {
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.dob = dob;
    }

    public Person(String vorname, String nachname, LocalDate dob, String wohnort) {
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.dob = dob;

    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = Person.nullCheck(vorname);
    }

    public String getNachname() {
        return nachname;
    }

    public static String nullCheck(String str) {
        if (str == null || str.length() < 2) {
            throw new IllegalArgumentException("Darf nicht null oder muss länger als 2 Zeichen sein");
        } else {
            return str;
        }

    }

    public void setNachname(String nachname) {
        this.nachname= Person.nullCheck(nachname);
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", dob=" + dob +
                '}';
    }

    public static void creatInstances() {
        Person user = new Person("Thomas", "Brandner", LocalDate.of(1986, 2, 26));
        Person userToo = new Person("Christoph", "Brandner", LocalDate.of(1990, 1, 30));

        System.out.println(user.toString());
        System.out.println(userToo.toString());


    }

}
