package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.Student.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	@Query("From Student where id=2")
	List<Student> findAll();
}
