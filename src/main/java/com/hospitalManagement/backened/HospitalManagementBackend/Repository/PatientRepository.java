package com.hospitalManagement.backened.HospitalManagementBackend.Repository;


import com.hospitalManagement.backened.HospitalManagementBackend.Models.Patient;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class PatientRepository {

    HashMap<String , Patient> patientDb =new HashMap<>();
    private int overallPatients;

    public PatientRepository() {
        this.patientDb = new HashMap<>();
        this.overallPatients=0;

    }
    public Patient getPatientById(String pId){
        System.out.println(this.patientDb);
        return this.patientDb.get(pId);

    }
    public void addPatient(Patient obj){
        System.out.println(obj.getPatientId());

        this.overallPatients+=1;
        this.patientDb.put(obj.getPatientId() ,obj);
        System.out.println(this.patientDb);
    }
    public void dischargePatientById(String pId){
        this.patientDb.remove(pId);
    }

    public int getOverallPatients(){
        return this.overallPatients;
    }
    public int totalPatients(){
        return patientDb.size();
    }
}
