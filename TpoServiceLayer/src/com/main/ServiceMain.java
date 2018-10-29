package com.main;

import java.util.List;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class ServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentService studentService=new StudentServiceImpl();
List<Student> placedStudentlist = studentService.getUnplacedStudent();
for(Student student:placedStudentlist)
	System.out.println(student);
	}

}
