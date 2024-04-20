package com.peytosoft.springboothello.test;

import com.peytosoft.springboothello.entities.Patient;

import java.util.GregorianCalendar;

public class Test {



    Patient patient = new Patient(
            1,
            "John",
            "Doe",
            new GregorianCalendar(1999,5, 25),
            "Male",
            "1234567890",
            "john.doe@example.com",
            "123 Main St, City, Country",
            "No significant medical history",
            "Insurance Company XYZ",
            "Jane Doe (Spouse)",
            "password123"
    );
    public void addTest() {

    }

}
