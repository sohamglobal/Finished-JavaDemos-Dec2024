package com.praffull.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
<%
Configuration cfg=new Configuration().configure();
SessionFactory sf=cfg.addAnnotatedClass(Student.class).buildSessionFactory();
Session ses=sf.getCurrentSession();
ses.beginTransaction();
//Rollnumber will be taken automatically
Student s=new Student();
s.setStudnm("praffull");
s.setCourse("spark");
ses.persist(s);
ses.getTransaction().commit();
ses.close();

%>
*/

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollno;
	private String studnm;
	private String course;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudnm() {
		return studnm;
	}
	public void setStudnm(String studnm) {
		this.studnm = studnm;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	

}
