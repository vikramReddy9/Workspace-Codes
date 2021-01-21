package Hibdernate_SessionUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtility {

private static SessionFactory factory;
static
{
	factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
}
public static Session getSession()
{
	return factory.openSession();
}
	public static void CloseSession(Session ses)
	{
		if(ses!=null)
			ses.close();
	}
}
