package com.peytosoft.springboothello.dao;

import com.peytosoft.springboothello.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientDAO extends JpaRepository<Patient, Integer> {
    List<Patient> findByGender(String cat);
}
