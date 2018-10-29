package com.service;

import java.util.List;

import com.model.Company;
import com.model.Enrollment;

public interface EnrollmentService {
public List<Company> companiesEnrolledByStudentService(int sid);
public boolean addEnrollmentService(Enrollment enroll);
}
