package com.tp3.tp3;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tp3.tp3.repository.PatientRepository;
import com.tp3.tp3.entities.Patient;



@SpringBootApplication
public class Tp3Application implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(Tp3Application.class, args);

	}
	

	@Override
	public void run(String... args) throws Exception {
      
	    patientRepository.save(new Patient(null, "Hassan", new Date(	17/9/2002), true, 25));	
	    patientRepository.save(new Patient(null, "LAILA", new Date(	17/9/2002), true, 15));	
	    patientRepository.save(new Patient(null, "samir", new Date(	17/9/2002), false, 19));	

		
		
		
		
	}






	


}
