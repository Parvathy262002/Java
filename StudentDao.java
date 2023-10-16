package com.training.dao;

import java.util.List;

import com.training.model.Student;

public interface StudentDao {
	public void create(Student s);
	public List<Student> read() ;
	public void update(int regno);
	public void delete(int regno);

}
