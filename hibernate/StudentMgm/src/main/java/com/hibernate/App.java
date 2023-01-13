package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateUtil.HiberConn;
import com.studentDao.Access;

public class App {
	  
	   
      public static void main(String[] args) {
    	  
    	  Student s=new Student();
    	    s.setStu_rollNo(1);
    	    s.setName("preeti");
    	    s.setContact("Abheypur");
    	    System.out.println(s);
    	    Student s1=new Student();
    	    s1.setStu_rollNo(2);
    	    s1.setName("shivani");
    	    s1.setContact("badshapur");
    	    Student s2=new Student();
    	      s2.setStu_rollNo(3);
    	      s2.setName("kajal");
    	      s2.setContact("bhiravti");
    	    System.out.println(s2);
    	    Access a=new Access();
    	     a.insertStudent(s);
    	     a.insertStudent(s1);
    	     a.insertStudent(s2);
    	     System.out.println("inserted");
    	     
    	
		
	}
}
