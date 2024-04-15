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
	@Column(length = 10, nullable = false)
	private Integer ent_year;
	@Column(length = 3, nullable = false)
	private String class_num;
	@Column(length = 0, nullable = false)
	private String is_attend;
	@Column(length = 3, nullable = false)
	private String school_cd;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getno() {
		return no;
	}
	public void setno(String no) {
		this.no = no;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public Integer getent_year() {
		return ent_year;
	}
	public void setent_year(Integer ent_year) {
		this.ent_year = ent_year;
	}
	public String getclass_num() {
		return class_num;
	}
	public void setclass_num(String class_num) {
		this.class_num = class_num;
	}
	public String getis_attend() {
		return is_attend;
	}
	public void setis_attend(String is_attend) {
		this.is_attend = is_attend;
	}
	public String getschool_cd() {
		return school_cd;
	}
	public void setcd(String school_cd) {
		this.school_cd = school_cd;
	}
}