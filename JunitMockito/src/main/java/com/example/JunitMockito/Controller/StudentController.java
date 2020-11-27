package com.example.JunitMockito.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JunitMockito.Entity.Student;
import com.example.JunitMockito.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService std;
	
	@GetMapping(path = "/getStudentId")
	public Optional<Student> getId() {
		return std.getId(101);
	}

}
