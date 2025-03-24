package com.tp3.tp3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tp3.tp3.entities.Patient;

public interface PatientRepository  extends JpaRepository<Patient, Long> {      



    
}



