package com.studentDao;

import com.hibernate.Student;

public interface StudentDao {
	public void insertStudent(Student student);
	public void retStu(int id);
	public void  removeStu( int id);
	public void updateStu( Student student);
	public void printAllrec();

}
