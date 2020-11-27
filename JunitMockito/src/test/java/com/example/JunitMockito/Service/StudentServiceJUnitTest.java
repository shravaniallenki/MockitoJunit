package com.example.JunitMockito.Service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.JunitMockito.Entity.Student;

@SpringBootTest
class StudentServiceJUnitTest {

	@Autowired
	StudentService std;
	
	
	@Test
	void test() {
		
	}

	@Test
	public void getCourseTest() {
		assertEquals("Shravani", std.getId(101).get().getStudentCourse());
}
	
	@Test
	public void getNameTest() {
		assertEquals("ECE", std.getId(101).get().getStudentName());
}
}
