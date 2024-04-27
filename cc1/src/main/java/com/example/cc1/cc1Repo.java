package com.example.cc1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cc1Repo extends JpaRepository<cc1,String> {
    
}
