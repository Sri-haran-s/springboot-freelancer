package com.example.cc1;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class cc1Service {
    @Autowired
    cc1Repo cr;

    public cc1 create(cc1 c) {
        return cr.save(c);
    }

    public ResponseEntity<List<cc1>> get() {
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    public List<cc1> getAll() {
        return(List<cc1>)cr.findAll();
    }

    public cc1 getById(String field) {
        return cr.findById(field).orElse(null);
    }

    public boolean updateDetails(String field, cc1 c) {
       if(cr.findById(field)==null)
       {
        return false;
       }
       try{
        cr.save(c);
       }
       catch(Exception e)
       {
        return false;
       }
       return true;
    }

    public boolean deleteDetails(String name) {
        if(cr.findById(name)==null)
        {
            return false;
        }
        cr.deleteById(name);
        return true;
    }

    
}