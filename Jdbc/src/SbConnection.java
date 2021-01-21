import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

import com.vik.config.ConnectionManager;

public class SbConnection {
// the logic which we are writing to interact with database software is called persistence logic
//jdbc(java database connectivity)--> using jdbc we can interact with the database software to perform manipulations like insert,update,delete and retrieve data
// in two packages 1)java.sql.*; 2)javax.sql.*;
// To interact with database we need to have 1)Driver class 2)Driver url . These are provided by diff types of vendors(SunMicroSystems(java),DB vendor(oracle,sql),Third party vendor)
//Types OF Drivers--->
//1)Type-1(JbdcOdbcBridge Driver)--->This driver is given by sun micro systems along with J2DK installation.Not suitable for internet programming.It is mandatory to install DB in your system
//username-->Jdbc:Odbc:JdbcOdbcDriver////Driver Url--->Jdbc:Odbc:dsn
//2)Type-2(NativeApi Driver)---->The Driver is given by DB vendor.if you are working with oracle then oracle will provide driver and url.The driver is designed in someother language.It is mandatory install DB in your system
//3)Type-3(NetworkProtocol Driver)---->Driver is given by Db vendor and we will use inside the server like tomcat
//4)Type-4(Thin Driver)----> Driver is given by DB vendor. This driver is developed using java.It is not required to install DB software in each system seperately
//Driver class-->oracle:jdbc:driver:OracleDriver{OracleDriver is a class & it is provided by db vendor and oracle:jdbc:driver; is a pacakage} ////Driver Url--->Jdbc:Oracle:thin:@localhost:1521:sid(service ID)	
//DriverManager(represent set of drivers) is a class they have some methods all are static methods	
//pre defined methods-->
//public static void registerDriver(DriverName)throws SQL exception--> using this method we can register with DriverManager
//public static connection getConnection(String url,String username,String Password)throws SQL exception---> using this we can establish connection with DM
//public static connection getConnection(String url)throws SQL exception
//public static connection getConnection(String url,properties prop)throws SQL exception
//Note:Registering driver with DriverManager we can perform in diff ways
//1)using register driver method 2)ClassforNmae(String classname)throws ClassNotFoundException---> it is available in java.lang.*;
	// prepare statement ---->we can call this as pre compiled query(instead  of statement we need to use prepared statement)
// ??? technically we can call as placeholders.
	//by using setxxx method we can insert values xxx(int,string-->depending on the coloumn values that we want to set in the database)
// implementation class will be provided by drivervendor{Statement,Connection interfaces}
// to create a statement object{--> we required a method createStatement method return type is Statement is available on connection interface}
// sql quries are classified into two types 
	//1)Non select sql quries(insert,delete,update,retrive)--->int executeUpdate(String sql_query)
	//2)Select sql queries(retrive)--->Resultset executeQuery(String sql_query)
	//These methods are available in Statement interface 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Connection c=null;
         Statement s=null;
		try {	
			c=ConnectionManager.getconnection();
			//step 3: create a statement
			s=c.createStatement();
			//step 4: create a query
			//String INSERT_QUERY="insert into student values(104,'vik','cad')";
			String UPDATE_QUERY="update student set sadd='canada'";
			//step 5:execute a query
			int count=s.executeUpdate(UPDATE_QUERY);
			if(count!=0)
				System.out.println("data inserted successfully");
			else
				System.out.println("data not inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//step 6: To close the connection 
		finally
		{
			try {
				ConnectionManager.release(c,s);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
