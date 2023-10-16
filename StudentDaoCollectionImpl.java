package com.training.dao;

import java.util.ArrayList;
import java.util.List;

import com.training.model.Student;

public class StudentDaoCollectionImpl implements StudentDao {
	static List<Student> studentList;

	public StudentDaoCollectionImpl() {
		if (studentList == null)
			studentList = new ArrayList<>();
	}

	@Override
	public void create(Student s) {
		// TODO Auto-generated method stub
		studentList.add(s);
	}

	public List<Student> read() {

		return studentList;
	}

	@Override
	public void update(int regno) {
		int size = studentList.size();
		Student stud = new Student();
		for (int i = 0; i < size; i++) {
			if (studentList.get(i).getRegno() == regno) {
				stud = studentList.get(i);
				stud.setTotalScore(stud.getJavaScore() + stud.getSqlScore() + stud.getWebScore());
				studentList.set(i, stud);
			}
		}

	}

	@Override
	public void delete(int regno) {
		// TODO Auto-generated method stub

	}

}
