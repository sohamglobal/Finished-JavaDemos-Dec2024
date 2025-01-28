package com.praffull.programs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.ashwini.classes.Employee;

public class EmpSerialize {
	public static void main(String[] args) throws IOException {
		Employee e=new Employee(786,"sharayu","female","london","marketing","executive","9890925745",45790.00);
		//System.out.println(e);
		
		FileOutputStream fout=new FileOutputStream("emp");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(e);
		System.out.println("Object stored in a file permanently");
		objout.close();
	}

}
