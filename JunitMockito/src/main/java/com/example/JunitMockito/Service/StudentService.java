package com.example.JunitMockito.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JunitMockito.Entity.Student;
import com.example.JunitMockito.Repository.StudentSpringDataRepo;

@Service
public class StudentService {
	
	
	
	@Autowired
	StudentSpringDataRepo studentSpringDataRepo;
	

	
	public Optional<Student> getId(int id) {
		return studentSpringDataRepo.findById(id);
		//return Std.getStudentId(id);
	}
	
	public String getData(int id) {
		return studentSpringDataRepo.findById(id).get().getStudentCourse();
	}
}
