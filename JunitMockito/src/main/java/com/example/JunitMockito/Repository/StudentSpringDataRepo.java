package com.example.JunitMockito.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JunitMockito.Entity.Student;

@Repository
public interface StudentSpringDataRepo extends JpaRepository<Student, Integer>{

}
