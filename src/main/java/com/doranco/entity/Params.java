package com.doranco.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "params")
public class Params {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // primary key
    
    @Column(name = "cle_cryptage_pwd")
    private String cle_cryptage_pwd;
    
    @Column(name = "cle_cryptage_cp")
    private String cle_cryptage_cp;



}
