package com.peytosoft.hospitalmanagement.service;


import com.peytosoft.hospitalmanagement.dao.PatientDAO;
import com.peytosoft.hospitalmanagement.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientDAO patientDAO;
    public ResponseEntity<List<Patient>>  getAllPatients() {
        try {
            return new ResponseEntity<> ( patientDAO.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<> (new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }
//
//    public List<Patient> getPatientByCategory(String cat) {
//        return patientDAO.findByCategory(cat);
//    }
//
    public ResponseEntity<String> addPatient(Patient patient) {
        patientDAO.save(patient);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
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
