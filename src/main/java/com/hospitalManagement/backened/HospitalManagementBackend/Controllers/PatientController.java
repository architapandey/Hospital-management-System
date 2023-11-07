package com.hospitalManagement.backened.HospitalManagementBackend.Controllers;

import com.hospitalManagement.backened.HospitalManagementBackend.Models.Patient;
import com.hospitalManagement.backened.HospitalManagementBackend.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/api/patient")
    public Patient getPatient(@RequestParam String patientId){
        return patientService.getPatientById(patientId);
    }

    @PostMapping("/api/patient/addPatient")

    public String addPatients(@RequestBody Patient obj ){
        patientService.addPatientToDatabase(obj);
        return "Patients Successfully Added";

    }

    @DeleteMapping("api/patient")
    public String deletePatientById(@RequestParam String pId){
        patientService.dischargePatient(pId);
        return "Patient successfully Deleted from Database";

    }
  }
