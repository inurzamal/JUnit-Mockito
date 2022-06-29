package com.nur.student.dal.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.nur.student.dal.entities.Student;
import com.nur.student.dal.repo.StudentRepository;

public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		Optional<Student> optional = studentRepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
		
	}

}
