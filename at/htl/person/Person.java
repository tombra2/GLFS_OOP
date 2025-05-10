package at.htl.person;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthdate;
    private String zipCode;
    private String city;

    public Person(String firstName, String lastName, LocalDate birthdate, String zipCode, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public int getAge(){
        LocalDate convertToYearNow = LocalDate.now();
        LocalDate convertToYearBirth = this.birthdate;
        return Period.between(convertToYearBirth,convertToYearNow).getYears();
    }
    @Override
    public String toString() {
        return String.format("|%s %s|Geburtsdatum: %s | Postleitzahl: %s | City %s %n",firstName,lastName,birthdate,zipCode,city );
    }
}
