package com.sms.Studentd;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sms.config.ConnectionManager;

public class ProcedureStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		CallableStatement cs=null;
	
		try {
		con=ConnectionManager.getConnection();
		 cs=con.prepareCall("call stu_pro5(?,?,?)");            
		 cs.setInt(1, 767);
		 cs.setString(2, "tgh");
		 cs.setString(3, "dbfsfv");
			cs.execute();
			//ps=con.prepareStatement("select * from Student1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}

