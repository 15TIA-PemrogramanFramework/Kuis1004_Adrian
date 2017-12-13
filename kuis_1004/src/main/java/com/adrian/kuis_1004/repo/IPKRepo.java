/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adrian.kuis_1004.repo;

import com.adrian.kuis_1004.entity.IPK;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface IPKRepo extends CrudRepository<IPK, Long>{
    
    @Query("select p from IPK p")
    public List<IPK> findAllProduct();
}
