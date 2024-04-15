package com.example.iteam.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.iteam.model.StudentHyou;
 
@Repository
public interface StudentRepository  extends JpaRepository<StudentHyou, Long>{
 
}
