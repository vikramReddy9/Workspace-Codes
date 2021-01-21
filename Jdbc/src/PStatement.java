import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vik.config.ConnectionManager;

public class PStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection c=null;
PreparedStatement p=null;
try {
	c=ConnectionManager.getconnection();
	String INSERT_QUERY="insert into Student values(?,?,?)";
	p=c.prepareStatement(INSERT_QUERY);
	p.setInt(1, 108);
	p.setString(2, "suzuki");
	p.setString(3, "canada");
	int count=p.executeUpdate();
	if(count!=0)
		System.out.println("data inserted successfully");
	else
		System.out.println("data not inserted successfully");
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally
{
	try {
		ConnectionManager.release(c,p);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}

}
