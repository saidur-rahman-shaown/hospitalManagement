package com.peytosoft.springboothello.controller;


import com.peytosoft.springboothello.entities.Patient;
import com.peytosoft.springboothello.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("allPatients")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();

    }
//
//    @GetMapping("catagory/{cat}")
//    public List<Patient> getPatientByCategory(@PathVariable String cat) {
//        return patientService.getPatientByCategory(cat);
//    }
//
    @PostMapping("add")
    public String addPatient(@RequestBody Patient patient) {
       return patientService.addPatient(patient);
    }


    @GetMapping("test")
    public String testApp() {
        return patientService.test();
    }
}
