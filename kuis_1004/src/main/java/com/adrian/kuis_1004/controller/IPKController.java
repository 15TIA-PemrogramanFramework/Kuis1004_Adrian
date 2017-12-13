/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adrian.kuis_1004.controller;

import com.adrian.kuis_1004.entity.IPK;
import com.adrian.kuis_1004.entity.Identitas;
import com.adrian.kuis_1004.repo.IPKRepo;
import com.adrian.kuis_1004.service.IPKService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/IPK")
public class IPKController {
    
    @Autowired
    private IPKService ipkService;
    
    @RequestMapping(method = RequestMethod.POST)
    public IPK insertOrUpdate(@RequestBody IPK ipk){
        return ipkService.insertOrUpdate(ipk);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<IPK> getAll(){
        return ipkService.getAll();
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipkService.delete(id);
    }
  
}
