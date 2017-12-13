/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adrian.kuis_1004.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "identitas_1004")
public class Identitas implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 255, nullable = true)
    private String email;
    @Column(length = 255, nullable = true)
    private String jenis_kelamin;

    public Long getId() {
        return id;  
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the description to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the 
     */
      public String getJenisKelamin() {
        return jenis_kelamin;
    }

    /**
     * @param jeniskelamin the description to set
     */
    public void setJenisKelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
    
}
