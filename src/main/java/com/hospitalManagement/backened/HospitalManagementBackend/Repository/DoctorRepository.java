package com.hospitalManagement.backened.HospitalManagementBackend.Repository;

import com.hospitalManagement.backened.HospitalManagementBackend.Models.Doctor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class DoctorRepository {

    private HashMap<String, Doctor> docDatabase;
    private int overAllDoctors;

    public DoctorRepository() {
        this.docDatabase = new HashMap<>();
        this.overAllDoctors=0;

    }
    public void addDoctorToDatabase(Doctor obj){
        this.overAllDoctors+=1;
        docDatabase.put(obj.getDocId(), obj);
    }
    public Doctor getDoctorById(String docId){
        return docDatabase.get(docId);
    }
    public int getTotalDoctors(){
        return docDatabase.size();
    }

    public int getOverAllDoctors(){
        return this.overAllDoctors;
    }
    public void updateDocDetailsByDocId(String docId , Doctor obj){
        this.docDatabase.put(docId , obj);

    }
}
