package com.tp3.tp3.web;

import com.tp3.tp3.entities.Patient;
import com.tp3.tp3.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.ui.Model;



@Controller
@AllArgsConstructor
public class Patientcontroller {

   @Autowired
   private PatientRepository patientRepository;




@GetMapping("/index")
public String index( Model model) {
    List<Patient> patientList =patientRepository.findAll();
    model.addAttribute("listePatients", patientList);


    return "patients" ;
}





}
