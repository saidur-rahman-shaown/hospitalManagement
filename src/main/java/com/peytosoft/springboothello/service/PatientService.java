package com.peytosoft.springboothello.service;


import com.peytosoft.springboothello.dao.PatientDAO;
import com.peytosoft.springboothello.entities.Patient;
import com.peytosoft.springboothello.test.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.GregorianCalendar;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientDAO patientDAO;
    public List<Patient> getAllPatients() {
        return patientDAO.findAll();
    }
//
//    public List<Patient> getPatientByCategory(String cat) {
//        return patientDAO.findByCategory(cat);
//    }
//
    public String addPatient(Patient patient) {
        patientDAO.save(patient);
        return "success";
    }

    //test app

    public String test() {
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
        patientDAO.save(patient);
        return "success";
    }
}
