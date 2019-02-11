package com.pack.bean;

public class College {

	private Student student;
	private String name;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void collegeStudent() {
		student.showstudent();
		System.out.println("Name is:"+name);
	}
}
