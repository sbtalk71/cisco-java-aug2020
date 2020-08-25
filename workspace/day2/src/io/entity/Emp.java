package io.entity;

import java.io.Serializable;

public class Emp implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int empId;
	private String name;
	private String city;
	private double sal;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int empId, String name, String city, double sal) {
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {

		return empId + " " + name + " " + city + " " + sal;
	}
}
