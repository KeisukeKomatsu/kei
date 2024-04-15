package com.example.iteam.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.iteam.model.SchoolHyou;
 
@Repository
public interface SchoolRepository  extends JpaRepository<SchoolHyou, Long>{
 
}
