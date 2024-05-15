package com.example.iteam.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.iteam.model.SubjectHyou;
 
@Repository
public interface SubjectRepository  extends JpaRepository<SubjectHyou, Long>{
 
}
