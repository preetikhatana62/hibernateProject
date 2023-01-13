package com.hibernateUtil;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.Student;

public class HiberConn {
	public static SessionFactory sf;
	public static SessionFactory getCon()
	{   Configuration cf=new Configuration();
	     Properties pr=new Properties();
	       pr.put(Environment.USER, "root");
	       pr.put(Environment.PASS, "preeti12345@");
	       pr.put(Environment.URL,"jdbc:mysql://localhost:3306/data");
	       pr.put(Environment.HBM2DDL_AUTO, "update");
	       pr.put(Environment.FORMAT_SQL, true);
	       pr.put(Environment.SHOW_SQL, true);
	        cf.addAnnotatedClass(Student.class);
	        cf.setProperties(pr);
	        ServiceRegistry sr=new StandardServiceRegistryBuilder().applySettings(cf.getProperties()).build();
		      sf= cf.buildSessionFactory();
		      return sf; 
		  
	}
	

	

}
