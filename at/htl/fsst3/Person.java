package at.htl.fsst3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private int height;
    private double weight;
    private double bmi;

    public Person(String firstName, String lastName, LocalDate dob, int height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
        this.bmi = calcBmi();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(String dayOfBirth) {
        this.dob = LocalDate.parse(dayOfBirth, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(this.getDob(), today).getYears();
    }

    public LocalDate compareDateOfBirth(LocalDate per) {
        if (this.dob.isBefore(per)) {
            return this.dob;
        } else {
            return per;
        }

    }

    public String calcZodiacSign() {
        if (this.dob.isBefore(LocalDate.of(2025, 2, 19)) && this.dob.isAfter(LocalDate.of(2025, 1, 21))) {

            return "Wassermanm";
        } else if (this.dob.isBefore(LocalDate.of(2025, 3, 20)) && this.dob.isAfter(LocalDate.of(2025, 2, 19))) {
            return "Fisch";

        } else {
            return "nicht wichtig";
        }
    }
public double calcBmi(){
        return this.weight/Math.pow(this.height/100.0,2);

}
    @Override
    public String toString() {
        return String.format("%s %s (%s / %d Jahre) die Person hat %.2f und ist %d cm groß.",
                this.firstName,
                this.lastName,
                this.getDob(),
                getAge(),
                this.weight,
                this.height);
    }
}
