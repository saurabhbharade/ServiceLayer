package com.service;


import java.util.List;

import com.model.Student;

public interface StudentService {
public Student getStudentService(int sid);
public List<Student>getAllStudentService();
public List<Student> getPlacedStudent();
public List<Student> getUnplacedStudent();
public void addStudentService(Student student);
//public List<Student>getStudentforDreamStatus(float dreamcriteria);
//public void updateStudentService():

}
