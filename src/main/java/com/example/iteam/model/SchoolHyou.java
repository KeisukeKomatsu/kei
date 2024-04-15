package com.example.iteam.model;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="schoolhyou")
public class SchoolHyou {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	@Column(length = 3, nullable = false)
	private String cd;
	@Column(length = 20, nullable = false)
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getcd() {
		return cd;
	}
	public void setcd(String cd) {
		this.cd = cd;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
}