package at.htl.person;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonUnit {

    @Test
    void fullName() {
        Person person = new Person("Thomas","Brandner", LocalDate.of(1986,2,26),"9020","Klagenfurt");
        String fullName = person.fullName();
        assertEquals("Thomas Brandner", person.fullName(),"Hier wird der Full Namegetestet");
        assertEquals(String.class,person.fullName().getClass());
    }


    @Test
    void isObject() {
        Person person = new Person("Thomas","Brandner", LocalDate.of(1986,2,26),"9020","Klagenfurt");
        assertInstanceOf(Object.class, person);
    }



    @Test
    void testToString() {
    }

    @Test
    void isString() {

    }
}