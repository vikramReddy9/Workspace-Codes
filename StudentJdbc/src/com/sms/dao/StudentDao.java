package com.sms.dao;

import java.sql.SQLException;
import java.util.List;

import com.sms.bean.Student;

public interface StudentDao {
public void insert(Student s);
public List<Student> viewAllstudents();
public Student viewstudents(int sno);
public int updatestudent(int sno);
public boolean deletestudent(int sno);
}
