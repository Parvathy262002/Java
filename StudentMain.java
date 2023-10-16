package com.training.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.model.Student;
import com.training.service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int choice;
		String ch="yes";
		int regno,webscore,javascore,sqlscore;
		String name;
		StudentService studentService=new StudentService();
		Student s=null;
		List<Student> studentList=new ArrayList<>();
		do
		{
		System.out.println("1. Create Student");
		System.out.println("2. Fetch Students");
		System.out.println("3. Update total");
		
		System.out.println("Enter choice");
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			s=new Student();
			System.out.println("Enter regno and name and scores  in 3 subjects");
			regno=scanner.nextInt();
			scanner.nextLine();
			name=scanner.nextLine();
			webscore=scanner.nextInt();
			javascore=scanner.nextInt();
			sqlscore=scanner.nextInt();
			s.setRegno(regno);
			s.setName(name);
			s.setJavaScore(javascore);
			s.setSqlScore(sqlscore);
			s.setWebScore(webscore);
			studentService.create(s);
			break;
		case 2:
			   studentList=studentService.read();
			   for(Student stud:studentList)
			   {
				   System.out.println(stud);
			   }
			   break;
		case 3:
			System.out.println("Enter register number to update total");
			regno=scanner.nextInt();
			studentService.update(regno);
			break;
			
		}
		System.out.println("Want to continue yes/no");
		ch=scanner.next();
		}
		while(ch.equals("yes"));
	}

}
