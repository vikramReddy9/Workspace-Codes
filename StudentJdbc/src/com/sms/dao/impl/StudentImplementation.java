package com.sms.dao.impl;
import com.sms.query.QueryConstants;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sms.StudentDetails.StudentDetails;
import com.sms.bean.Student;
import com.sms.config.ConnectionManager;
import com.sms.dao.StudentDao;
import com.sms.query.QueryConstants;
import com.sms.bean.Student;
public class StudentImplementation implements StudentDao {
	
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
public void insert(Student s) {	
		try {
		con=ConnectionManager.getConnection();
		ps=con.prepareStatement(QueryConstants.INSERT_QUERY);
		ps.setInt(1,s.getSno());
		ps.setString(2,s.getSname());
		ps.setString(3,s.getSadd());
		int count=ps.executeUpdate();
		if(count!=0)
			System.out.println("Data insetred successfully");
		else
			System.out.println("Data not inserted successfully");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		try {
			ConnectionManager.release(con,ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	}

	public List<Student> viewAllstudents() {
		// TODO Auto-generated method stub
		List<Student>addrecords=new ArrayList<>();
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstants.SELECT_QUERY);
            rs=ps.executeQuery();
            while(rs.next())
            {
            	int Sno=rs.getInt(1);
            	String Sname=rs.getString(2);
             	String Sadd=rs.getString(3);
            	
            	Student s=new Student(Sno,Sname,Sadd);
            	addrecords.add(s);
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ConnectionManager.release(con,ps,rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return addrecords;
	}

	public Student viewstudents(int sno) {
		// TODO Auto-generated method stub
		Student s=null;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstants.SELECT_SPECIFIC_QUERY);
			ps.setInt(1,sno);
           rs=ps.executeQuery();
            if(rs.next())
            {
            	int no=rs.getInt(1);
            	String sname=rs.getString(2);
            	String sadd=rs.getString(3);
            	 s=new Student(no,sname,sadd);	
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ConnectionManager.release(con,ps,rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return s;
	}

	public int updatestudent(int sno) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student s=viewstudents(sno);
		int count=0;
		try {
			con=ConnectionManager.getConnection();
			if(s!=null)	
			{
			System.out.println("do you want to update 1)sname 2)sadd ");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter student name ");
				String sname=sc.next();
				ps=con.prepareStatement(QueryConstants.UPDATE_SNAME_QUERY);
				ps.setInt(2,sno);
				ps.setString(1, sname);
				count=ps.executeUpdate();
				break;
			case 2:
				System.out.println("enter student sadd ");
				String sadd=sc.next();
				ps=con.prepareStatement(QueryConstants.UPDATE_SADD_QUERY);
				ps.setInt(2,sno);
				ps.setString(1, sadd);
				count=ps.executeUpdate();
				break;
				default:
					System.out.println("choose between 1 and 2");
			}
			}
		}
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ConnectionManager.release(con,ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return count;
	}

	public boolean deletestudent(int sno) {
		// TODO Auto-generated method stub
		int count=0;
		boolean flag=false;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstants.DELETE_QUERY);
			ps.setInt(1, sno);
		     count=ps.executeUpdate();
			if(count!=0)
				flag=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
