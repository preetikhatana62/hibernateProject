package com.studentDao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.Student;
import com.hibernateUtil.HiberConn;

public class Access implements StudentDao {
	 public static  SessionFactory sf= HiberConn.getCon();
	   public static  Session session =sf.openSession();
	   public static Transaction tr=session.beginTransaction();

	@Override
	public void insertStudent(Student student) {
		 session.save(student);
  	  }

	@Override
      public void  retStu(int id) {
		
	   Student s= session.get(Student.class, 1);
	   System.out.println(s);
		
	}

	@Override
	public void removeStu(int id) {
		Student s= session.get(Student.class, 2);
		
				
	}

	@Override
	public void updateStu(Student student) {
		session.saveOrUpdate(student);
		
	}

	@Override
	public void printAllrec() {
		Query q=session.createQuery("from Student");
		 List<Student> list= q.list();
		 for(Student s2: list)
		 {
			 System.out.println(s2);
		 }
		
	}

}
