package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.dao.StudentExistsException;
import com.model.Company;
import com.model.Student;

public class StudentServiceImpl implements StudentService{
StudentDao studentDao=new StudentDaoImpl();
	
	@Override
	public Student getStudentService(int sid) {
		// TODO Auto-generated method stub
		return studentDao.getStudent(sid);
	}

	@Override
	public List<Student> getAllStudentService() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudents();
	}

	@Override
	public List<Student> getPlacedStudent() {
		// TODO Auto-generated method stub
		List<Student> allStudents = studentDao.getAllStudents();
		List<Student> placedStudentList=new ArrayList<Student>();
		for(Student student:allStudents)
		{
			if(student.getStatus()==1)
			{
				placedStudentList.add(student);
				
			}
		}
		return placedStudentList;
		
	}

	@Override
	public List<Student> getUnplacedStudent() {
		// TODO Auto-generated method stub
		List<Student> allStudents = studentDao.getAllStudents();
		List<Student> placedStudentList=new ArrayList<Student>();
		for(Student student:allStudents)
		{
			if(student.getStatus()==0)
			{
				placedStudentList.add(student);
				
			}
		}
		return placedStudentList;
	}

	@Override
	public void addStudentService(Student student) {
		// TODO Auto-generated method stub
		try {
			studentDao.addStudent(student);
		} catch (StudentExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	@Override
//	public List<Student> getStudentforDreamStatus(float dreamcriteria) {
//		List<Student> dreamStatusList = new StudentServiceImpl().getUnplacedStudent();
//		List<Student> placedStudentList = new StudentServiceImpl().getPlacedStudent();
//		
//		for(Student student:placedStudentList)
//		{
//			List<Company> companiesEnrolledByStudentList = new EnrollmentServiceImpl().companiesEnrolledByStudentService(student.getSid());
//			for(Company company:companiesEnrolledByStudentList)
//			{
//				if(company.getSalary()<5)
//			}
//		}
//		return null;
//	}

	
}
