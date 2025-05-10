package at.htl.fsst3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Pets {

    private String petName;
    private String petColor;
    private LocalDate petdob;
    private String petBreed;
    private int petAge;


    public Pets(String petName, String petColor, LocalDate petdob, String petBreed) {
        this.petName = petName;
        this.petColor = petColor;
        this.petdob = petdob;
        this.petBreed = petBreed;
    }


    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetColor() {
        return petColor;
    }

    public void setPetColor(String petColor) {
        this.petColor = petColor;
    }

    public LocalDate getPetdob() {
        return petdob;
    }

    public void setPetdob(LocalDate petdob) {
        this.petdob = petdob;
    }

    public void setPetdob(String dobString) {
        DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.GERMAN);
        try {
            this.petdob =  LocalDate.parse(dobString,form);
        } catch (DateTimeParseException e){
            throw new IllegalArgumentException("Falsches Datumsformat gewählt",e);
        }
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public int getPetAge() {
        return Period.between(this.petdob,LocalDate.now()).getYears();
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    @Override
    public String toString() {
        return String.format("%s (%s %d)", petName, petdob,getPetAge());
    }
}
