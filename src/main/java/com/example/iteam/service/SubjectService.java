package com.example.iteam.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.example.iteam.model.SubjectHyou;
import com.example.iteam.repository.SubjectRepository;

import jakarta.transaction.Transactional;

 
@Service
@Transactional
public class  SubjectService{
 
    @Autowired
    private SubjectRepository repository;
 
    /**
     * 学生一覧の取得
     * @return List<Subject>
     */
    public List<SubjectHyou> getSubjectList() {
        List<SubjectHyou> entityList = this.repository.findAll();
        return entityList;
    }
 
    /**
     * 詳細データの取得
     * @param @NonNull Long index
 
     */
    public SubjectHyou get(@NonNull Long index) {
        SubjectHyou student = this.repository.findById(index).orElse(new SubjectHyou());
        return student;
    }
 
    public void save(@NonNull SubjectHyou subject) {
        this.repository.save(subject);
    }
 
    /**
     * アドレス帳データの削除
     * @param @NonNull Long index
     */
    public void delete(@NonNull Long index) {
        this.repository.deleteById(index);
    }
}