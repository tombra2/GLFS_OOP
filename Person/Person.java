package Person;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String zipCode;
    private String city;

    public Person(String firstName, String lastName, LocalDate dob, String zipCode, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.zipCode = zipCode;
        this.city = city;
    }
}


