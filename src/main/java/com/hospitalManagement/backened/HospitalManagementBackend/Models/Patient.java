package com.hospitalManagement.backened.HospitalManagementBackend.Models;


public class Patient {
    private String pId;
    private String name;
    private String gender;
    private  int age;
    private String address;
    private String disease;

    public Patient(String pId, String name, String gender, int age, String address, String disease) {
        this.pId = pId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.disease = disease;
    }

    public String getPatientId() {
        return pId;
    }

    public void setPatientId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        disease = disease;
    }
}
