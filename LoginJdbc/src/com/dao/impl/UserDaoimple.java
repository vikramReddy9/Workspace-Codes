package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sms.config.ConnectionManager;
import com.user.Dao.UserDao;
import com.user.bean.UserBean;

public class UserDaoimple implements UserDao {
private Connection con=null;
private PreparedStatement ps=null;
private ResultSet rs=null;
	public int register(UserBean ub) {
		// TODO Auto-generated method stub
		int count=0;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement("insert into login values(login_id.nextVal,?,?,?,?,?)");
			ps.setString(1, ub.getFname());
			ps.setString(2, ub.getEmail());
			ps.setString(3, ub.getUsername());
			ps.setString(4, ub.getPassword());
			ps.setLong(5, ub.getMobilenumber());
			count=ps.executeUpdate();
			
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
		return count;
	}

	public boolean verifyuser(String username, String password) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement("select * from login where username=? and password=?");
			ps.setString(1,username);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next())
			{
				flag=true;
			}
			else
			{
				flag=false;
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
		return flag;
	}

}
