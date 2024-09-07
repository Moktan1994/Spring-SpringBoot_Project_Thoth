package com.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Student;
import com.spring.repository.StudentRepository;
import com.spring.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudentInformation(Student student) {
		return studentRepository.save(student);
	}

}
