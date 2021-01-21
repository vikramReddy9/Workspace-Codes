package com.Dao;


import java.util.ArrayList;
import java.util.List;

import com.bean.Student;
public interface StudentDao { 
void addstudents();
List<Student> viewAllstudents();
Student viewstudent(int sno);
void deletestudent(int sno);
void updatestudent(int sno);

}
