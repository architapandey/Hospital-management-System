package com.hospitalManagement.backened.HospitalManagementBackend.Services;


import com.hospitalManagement.backened.HospitalManagementBackend.Models.Patient;
import com.hospitalManagement.backened.HospitalManagementBackend.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepo;

    public void addPatientToDatabase(Patient obj){
//         String pId = "Patient" + (patientRepo.getOverallPatients()+1 );
        String pId = obj.getPatientId();
         obj.setPatientId(pId);
         patientRepo.addPatient(obj);
    }
    public void dischargePatient(String pId){
        patientRepo.dischargePatientById(pId);
    }
    public Patient getPatientById(String pId){
        return patientRepo.getPatientById(pId);
    }


}
