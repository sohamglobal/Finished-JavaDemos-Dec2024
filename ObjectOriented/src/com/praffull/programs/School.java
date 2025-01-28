package com.praffull.programs;
import com.sharayu.classes.*;

public class School {
	public static void main(String[] args) {
		Student s=new Student();
		//s.studnm="sharayu";
		s.setStudnm("sharayu");
		s.showName();
		System.out.println(s.getStudnm());
		
		s.setStudnm("praffull");
		s.showName();
	}

}
