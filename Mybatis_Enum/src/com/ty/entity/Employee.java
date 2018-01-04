package com.ty.entity;

import java.io.Serializable;

import com.ty.enum1.Gender;

public class Employee implements Serializable {
	private Integer id;
	private String last_name;
	private Gender gender;
	private String email;
	private Department dept;

	public Department getDepartment() {
		return dept;
	}

	public void setDepartment(Department department) {
		this.dept = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Employee(String last_name, Gender gender, String email) {
		super();
		this.last_name = last_name;
		this.gender = gender;
		this.email = email;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", last_name=" + last_name + ", gender=" + gender + ", email=" + email + ", dept="
				+ dept + "]";
	}
}
