package com.service;

import java.util.List;

import com.dao.EnrollmentDao;
import com.dao.EnrollmentDaoImpl;
import com.model.Company;
import com.model.Enrollment;
import com.model.Student;

public class EnrollmentServiceImpl implements EnrollmentService{
EnrollmentDao enrollmentDao=new EnrollmentDaoImpl();
	@Override
	public List<Company> companiesEnrolledByStudentService(int sid) {
	return enrollmentDao.companiesEnrolledByStudent(sid);
	
	}
	@Override
	public boolean addEnrollmentService(Enrollment enroll) {
		Student student=enroll.getStudent();
		Company company=enroll.getCompany();
		// TODO Auto-generated method stub
		return false;
	}

}
