package com.peytosoft.hospitalmanagement.controller;

import com.peytosoft.hospitalmanagement.entities.Doctor;

import com.peytosoft.hospitalmanagement.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @GetMapping("")
    public String home() {
        return "index";
    }
    @GetMapping("allDoctors")
    public ResponseEntity<List<Doctor>> getAllDoctor() {
        return doctorService.getAllDoctors();

    }

    @PostMapping("add")
    public ResponseEntity<String> addDoctor(@RequestBody Doctor doctor) {
        return doctorService.addDoctor(doctor);
    }

    @GetMapping("test")
    public String testApp() {
        return doctorService.test();
    }




}
