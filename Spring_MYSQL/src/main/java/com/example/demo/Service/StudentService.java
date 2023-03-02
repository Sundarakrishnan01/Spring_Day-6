package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.Student.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository stu;

	public Student saveDetails(Student s) {
		return stu.save(s);
	}
	

	public List<Student> getAllDetails() {
		List<Student> arr = new ArrayList<>();
		arr = (List<Student>) stu.findAll();
		return arr;
	}

	public void deleteDepartmentById(Long id) {
		stu.deleteById(id);
	}
	public Student update(long id,Student s) {
		
		return stu.saveAndFlush(s);
	}
	
	public List<Student> page(int a,int b) {
		Pageable pageable=PageRequest.of(a,b);
		Page<Student> st=stu.findAll(pageable);
		return st.toList();
	}

	public Optional<Student> findById(Long id) {
		Optional<Student> stud = stu.findById(id);
		return stud;
	}
	
	public List<Student> q(){
		List<Student> g=stu.findAll();
		return g;
	}
	
	public List<Student> getSort(String name){
		List<Student> pass=stu.findAll(Sort.by("name").ascending());
		return pass;
	}
	


}
