package com.peytosoft.hospitalmanagement.entities;

import jakarta.persistence.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int patientID;
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Calendar dateOfBirth;
    private String gender;
    private String phone;
    private String email;
    private String address;
    private String medicalHistory;
    private String insuranceInfo;
    private String nextOfKin;
    private String password;

    public Patient() {
    }

    public Patient(int patientID, String firstName, String lastName, GregorianCalendar dateOfBirth, String gender, String phone, String email, String address, String medicalHistory, String insuranceInfo, String nextOfKin, String password) {
        this.patientID = patientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.medicalHistory = medicalHistory;
        this.insuranceInfo = insuranceInfo;
        this.nextOfKin = nextOfKin;
        this.password = password;
    }

    public int getPatientID() {

        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getInsuranceInfo() {
        return insuranceInfo;
    }

    public void setInsuranceInfo(String insuranceInfo) {
        this.insuranceInfo = insuranceInfo;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID=" + patientID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", medicalHistory='" + medicalHistory + '\'' +
                ", insuranceInfo='" + insuranceInfo + '\'' +
                ", nextOfKin='" + nextOfKin + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
