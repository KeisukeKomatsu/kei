package com.example.iteam.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.example.iteam.model.SchoolHyou;
import com.example.iteam.repository.SchoolRepository;

import jakarta.transaction.Transactional;

 
@Service
@Transactional
public class  SchoolService{
 
    @Autowired
    private SchoolRepository repository;
 
    /**
     * 学生一覧の取得
     * @return List<School>
     */
    public List<SchoolHyou> getSchoolList() {
        List<SchoolHyou> entityList = this.repository.findAll();
        return entityList;
    }
 
    /**
     * 詳細データの取得
     * @param @NonNull Long index
 
     */
    public SchoolHyou get(@NonNull Long index) {
        SchoolHyou school = this.repository.findById(index).orElse(new SchoolHyou());
        return school;
    }
 
    public void save(@NonNull SchoolHyou school) {
        this.repository.save(school);
    }
 
    /**
     * アドレス帳データの削除
     * @param @NonNull Long index
     */
    public void delete(@NonNull Long index) {
        this.repository.deleteById(index);
    }
}