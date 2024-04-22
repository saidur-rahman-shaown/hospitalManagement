package com.peytosoft.hospitalmanagement.controller;


import com.peytosoft.hospitalmanagement.entities.Patient;
import com.peytosoft.hospitalmanagement.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("")
    public String home() {
        return "index";
    }

    @GetMapping("allPatients")
    public ResponseEntity< List<Patient>> getAllPatients() {
        return patientService.getAllPatients();

    }
//
//    @GetMapping("catagory/{cat}")
//    public List<Patient> getPatientByCategory(@PathVariable String cat) {
//        return patientService.getPatientByCategory(cat);
//    }
//

    // rest add
    @PostMapping("add")
    public ResponseEntity<String> addPatient(@RequestBody Patient patient) {
       return patientService.addPatient(patient);
    }


    @GetMapping("test")
    public String testApp() {
        return patientService.test();
    }
}
