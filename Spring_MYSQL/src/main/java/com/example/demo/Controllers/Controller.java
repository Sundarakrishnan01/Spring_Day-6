package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student.Student;
import com.example.demo.Service.StudentService;

@RestController
public class Controller {
	@Autowired
	private StudentService studserv;

	@GetMapping("/show")
	public List<Student> showStudents() {
		return studserv.getAllDetails();
	}

	@PostMapping("/add")
	public Student addStudent(@RequestBody Student obj) {
		return studserv.saveDetails(obj);
	}

	@DeleteMapping("/delete/{id}")
	public String delStudent(@PathVariable Long id) {
		studserv.deleteDepartmentById(id);
		return "Successfully deleted!!!";
	}

	@GetMapping("/show/{id}")
	public Optional<Student> findById(@PathVariable Long id) {
		return studserv.findById(id);
	}
	
	@PutMapping("/update/{id}")
	public Student update(@PathVariable int id,@RequestBody Student s) {
		return studserv.update(id,s);
	}
	
	@GetMapping("/showPage/{m}/{n}")
	public List<Student> page(@PathVariable int m,@PathVariable int n) {
		return studserv.page(m, n);

	}
	
	@GetMapping("/showSort/{name}")
	public List<Student> sorting(@PathVariable("name") String name) {
		return studserv.getSort(name);

	}

}