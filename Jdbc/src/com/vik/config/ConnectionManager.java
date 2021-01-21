package com.vik.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
private static Connection c=null;
public static Connection getconnection() throws SQLException// user defined method this method is used to register and establish a connection
    {
	//step 1:Register a driver
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	System.out.println("Register a Driver");
	//step 2:establish a connection
	c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	if(c!=null)
		System.out.println("connection established");
	else
		System.out.println("connection not established");
	return c;
}
public static void release(Connection c) throws SQLException
{
	if(c!=null)
c.close();
}
public static void release(Connection c, Statement s) throws SQLException {
	if(s!=null)
		s.close();
	if(c!=null)
		c.close();

	
}
public static void release(Connection c, Statement s, ResultSet r) throws SQLException {
	if(s!=null)
		s.close();
	if(s!=null)
		s.close();
	if(c!=null)
		c.close();	
}
public static void release(Connection c,PreparedStatement p) throws SQLException
{
	if(c!=null)
c.close();
	if(p!=null)
		p.close();
}

}
