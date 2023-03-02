package com.example.demo.Student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long student_id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;

	public Student() {
	}

	public Student(Long student_id, String name, int age) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.age = age;
	}

	public Long getStudent_id() {
		return student_id;
	}

	public
	
	void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
