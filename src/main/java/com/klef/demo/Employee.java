package com.klef.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee {
	
	@Id
	@Column(name="eid")
	private int id;
	@Column(name="ename")
	private String empname;
	@Column(name="eloc")
	private String location;
	@Column(name="eage")
	private double age;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}

}
