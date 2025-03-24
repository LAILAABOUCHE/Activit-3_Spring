package com.tp3.tp3.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
  @Data @NoArgsConstructor @AllArgsConstructor @Builder 
  
  public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nom;
    private Date dateNaissance;
    private boolean malade;
    private int score;

    

  









}