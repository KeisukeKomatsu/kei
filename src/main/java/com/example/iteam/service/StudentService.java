package com.example.iteam.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.example.iteam.model.StudentHyou;
import com.example.iteam.repository.StudentRepository;

import jakarta.transaction.Transactional;

 
@Service
@Transactional
public class  StudentService{
 
    @Autowired
    private StudentRepository repository;
 
    /**
     * 学生一覧の取得
     * @return List<Student>
     */
    public List<StudentHyou> getStudentList() {
        List<StudentHyou> entityList = this.repository.findAll();
        return entityList;
    }
 
    /**
     * 詳細データの取得
     * @param @NonNull Long index
 
     */
    public StudentHyou get(@NonNull Long index) {
        StudentHyou student = this.repository.findById(index).orElse(new StudentHyou());
        return student;
    }
 
    public void save(@NonNull StudentHyou student) {
        this.repository.save(student);
    }
 
    /**
     * アドレス帳データの削除
     * @param @NonNull Long index
     */
    public void delete(@NonNull Long index) {
        this.repository.deleteById(index);
    }
}