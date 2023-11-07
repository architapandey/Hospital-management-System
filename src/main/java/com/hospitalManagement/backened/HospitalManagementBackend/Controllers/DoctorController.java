package com.hospitalManagement.backened.HospitalManagementBackend.Controllers;


import com.hospitalManagement.backened.HospitalManagementBackend.Models.Doctor;
import com.hospitalManagement.backened.HospitalManagementBackend.Repository.DoctorRepository;
import com.hospitalManagement.backened.HospitalManagementBackend.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorController {

    @Autowired
    DoctorService doctorService;


    @PostMapping("/api/doctor/addDoctor")
        public String addDoctorsToDatabase (@RequestBody Doctor obj){
        doctorService.addDoctorsToDatabase(obj);
        return "Doctor Added Successfully";
    }
    @GetMapping("/api/doctor")
    public Doctor getDoctorById(@RequestParam String docId){
        return doctorService.getDoctorById(docId);
    }

    @PutMapping("api/doctor")
    public String updateDoctorById(@RequestParam String docId , @RequestBody Doctor obj ){
         doctorService.updateDocDetailsById(docId,obj);
        return "Doctor Details with" +docId+" Successfully Updated";
    }


}
