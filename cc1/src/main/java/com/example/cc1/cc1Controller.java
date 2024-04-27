package com.example.cc1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cc1Controller  {
    @Autowired
    cc1Service cs;
    @PostMapping("/detail")
    public ResponseEntity<cc1> adddetails(@RequestBody cc1 c)
    {
         cc1 cc1=cs.create(c);
         return new ResponseEntity<>(cc1,HttpStatus.CREATED);
    }
    @GetMapping("/alldetails")
    public ResponseEntity<List<cc1>> getall()
    {
        try{
            List<cc1> c=cs.getAll();
            return new ResponseEntity<>(c,HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);

        }
    }
    @GetMapping("/details/{name}")
    public ResponseEntity<cc1> get(@PathVariable("name") String name)
    {
        try{
            cc1 cc=cs.getById(name);
            return new ResponseEntity<>(cc,HttpStatus.OK);

        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);

        }
    }
    @PutMapping("/update/{name}")
    public ResponseEntity<cc1> putMethod(@PathVariable("name") String name ,@RequestBody cc1 c)
    {
        if(cs.updateDetails(name, c)==true)
        {
            return new ResponseEntity<>(c,HttpStatus.OK);

        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);

    }
    @DeleteMapping("/delete/{name}")
    public ResponseEntity<Boolean> deleteMethod(@PathVariable( "name" )String name)
    {
        if(cs.deleteDetails(name)==true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);

        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);

    }
}