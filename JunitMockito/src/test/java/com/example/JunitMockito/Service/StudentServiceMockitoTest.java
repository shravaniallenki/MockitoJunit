package com.example.JunitMockito.Service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.JunitMockito.Entity.Student;
import com.example.JunitMockito.Repository.StudentSpringDataRepo;


@RunWith(MockitoJUnitRunner.class)
public class StudentServiceMockitoTest {
	
	@Mock
	StudentSpringDataRepo studentSpringDataRepo;
	
	@InjectMocks
	StudentService student;
	
	@Test
	public void runMockito() {
		
		when(studentSpringDataRepo.findById(101)).thenReturn(Optional.of(new Student(101,"Shravani","ECE")) );
		String std = student.getData(101);
		
		assertEquals("ECE", std);
		
	}

}
