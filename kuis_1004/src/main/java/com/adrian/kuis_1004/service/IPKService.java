/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adrian.kuis_1004.service;

import com.adrian.kuis_1004.entity.IPK;
import com.adrian.kuis_1004.repo.IPKRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("ipkService")
@Transactional
public class IPKService {

    @Autowired
    private IPKRepo repo;

    public IPK insertOrUpdate(IPK ipk) {
        return repo.save(ipk);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<IPK> getAll() {
        return repo.findAllProduct();
    }

}
