/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adrian.kuis_1004.repo;

import com.adrian.kuis_1004.entity.Identitas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface IdentitasRepo extends CrudRepository<Identitas, Long> {

    @Query("select c from Identitas c")
    public List<Identitas> findAllIdentitas();
}
