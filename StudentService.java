package com.training.service;

import java.util.List;

import com.training.dao.StudentDao;
import com.training.dao.StudentDaoCollectionImpl;
import com.training.model.Student;

public class StudentService {
	StudentDao studentDao = new StudentDaoCollectionImpl();

	public void create(Student s) {
		studentDao.create(s);
	}
	public List<Student> read()
	{
		return studentDao.read();
	}
	public void update(int regno) {
		
		studentDao.update(regno);
	}
}
