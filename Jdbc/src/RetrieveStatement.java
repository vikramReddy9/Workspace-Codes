import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vik.config.ConnectionManager;

public class RetrieveStatement {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection c=null;
Statement s=null;
	ResultSet r=null;	
try {
	c=ConnectionManager.getconnection();
	s=c.createStatement();
	String SELECT_QUERY="select * from Student";
	r=s.executeQuery(SELECT_QUERY);
	while(r.next())
	{
		int sno=r.getInt(1);
		String sname=r.getString(2);
		String sadd=r.getString(3);
		System.out.println(sno+"\t"+sname+"\t"+sadd);
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally
{
	try {
		ConnectionManager.release(c,s,r);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	}

}
