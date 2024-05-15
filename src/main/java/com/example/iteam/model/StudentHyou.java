package com.example.iteam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studenthyou")
public class StudentHyou {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(length = 10, nullable = false)
    private String no;

    @Column(length = 10, nullable = false)
    private String name;

    @Column(nullable = false)
    private int ent_year;

    @Column(length = 3, nullable = false)
    private String class_num;

    @Column(nullable = true)
    private Boolean is_attend;

    @Column(length = 3, nullable = false)
    private String school_cd;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnt_year() {
        return ent_year;
    }

    public void setEnt_year(int ent_year) {
        this.ent_year = ent_year;
    }

    public String getClass_num() {
        return class_num;
    }

    public void setClass_num(String class_num) {
        this.class_num = class_num;
    }

    public Boolean getIs_attend() {
        return is_attend;
    }

    public void setIs_attend(Boolean is_attend) {
        this.is_attend = is_attend;
    }

    public String getSchool_cd() {
        return school_cd;
    }

    public void setSchool_cd(String school_cd) {
        this.school_cd = school_cd;
    }
}
