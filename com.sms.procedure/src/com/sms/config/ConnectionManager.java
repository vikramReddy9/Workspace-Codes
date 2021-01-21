package com.sms.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionManager {
private static Connection con=null;
public static Connection getConnection() throws SQLException{

	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	System.out.println("register a driver");
   con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
    if(con!=null)
    	System.out.println("connection established");
    else
    	System.out.println("connection not established");
	return con;
}
public static void release(Connection con) throws SQLException
{
	if(con!=null)
con.close();
}
public static void release(Connection con, PreparedStatement ps) throws SQLException {
	if(con!=null)
		con.close();
	if(ps!=null)
	ps.close();
}
public static void release(Connection con, PreparedStatement ps, ResultSet rs) throws SQLException {
	if(con!=null)
		con.close();
	if(ps!=null)
	ps.close();
	if(rs!=null)
		rs.close();
}

}
