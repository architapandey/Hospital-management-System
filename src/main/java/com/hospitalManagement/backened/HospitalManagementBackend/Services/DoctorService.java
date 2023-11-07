package com.hospitalManagement.backened.HospitalManagementBackend.Services;


import com.hospitalManagement.backened.HospitalManagementBackend.Models.Doctor;
import com.hospitalManagement.backened.HospitalManagementBackend.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepo;

    public void addDoctorsToDatabase(Doctor obj){
        String docId = obj.getDocId();
        obj.setDocId(docId);
        doctorRepo.addDoctorToDatabase(obj);
    }
    public void updateDocDetailsById(String docId, Doctor obj){
        doctorRepo.updateDocDetailsByDocId(docId , obj);

    }
    public Doctor getDoctorById(String docId){
        return doctorRepo.getDoctorById(docId);

    }

}
