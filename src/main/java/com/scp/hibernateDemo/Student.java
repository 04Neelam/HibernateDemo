package com.scp.hibernateDemo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="STUDENT")

public class Student {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="rollno")
	private int stuRoll;
	
	@Column(name="name")
	private String stuName;
	@Column(name="address")
	private String stuAdd;
	@Temporal(TemporalType.DATE)
	private Date birthdate;
	public int getStuRoll() {
		return stuRoll;
	}
	public void setStuRoll(int stuRoll) {
		this.stuRoll = stuRoll;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuAdd() {
		return stuAdd;
	}
	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public Student(int stuRoll, String stuName, String stuAdd) {
		super();
		this.stuRoll = stuRoll;
		this.stuName = stuName;
		this.stuAdd = stuAdd;
	}
	
	
	
}
