package com.example.JunitMockito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.JunitMockito.Service.StudentService;

@SpringBootApplication
public class JunitMockitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JunitMockitoApplication.class, args);
		
		/*ApplicationContext appcontext = SpringApplication.run(JunitMockitoApplication.class, args);
		
		StudentService stdser = appcontext.getBean(StudentService.class);
		
		stdser.getId(101);*/
	}

}
