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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "ipk_1004")
public class IPK implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150, nullable = false)
    private String jurusan;
    private double ipk;
    @ManyToOne
    private Identitas identitas;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getJurusan() {
        return jurusan;
    }

    /**
     * @param name the name to set
     */
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    /**
     * @return the price
     */
    public double getIPK() {
        return ipk;
    }

    /**
     * @param price the price to set
     */
    public void setIPK(double ipk) {
        this.ipk = ipk;
    }


    /**
     * @return the category
     */
    public Identitas getIdentitas() {
        return identitas;
    }

    /**
     * @param category the category to set
     */
    public void setIdentitas(Identitas identitas) {
        this.identitas = identitas;
    }
    
    
}
