package com.peytosoft.hospitalmanagement.service;

import com.peytosoft.hospitalmanagement.dao.DoctorRepository;
import com.peytosoft.hospitalmanagement.entities.Doctor;
import com.peytosoft.hospitalmanagement.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public ResponseEntity<List<Doctor>>  getAllDoctors() {
        try {
            return new ResponseEntity<> ( doctorRepository.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<> (new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    public String test() {
        Date dateOfBirth = new Date(80, 0, 1); // January 1, 1980

        // Creating a Doctor instance
        Doctor doctor = new Doctor(
                1,
                "John",
                "Doe",
                dateOfBirth,
                "Male",
                "1234567890",
                "john.doe@example.com",
                "123 Main St, City, Country",
                "Cardiology",
                "Internal Medicine",
                "12345"
        );
        doctorRepository.save(doctor);
        return "success";
    }

}
