package com.praffull.programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.ashwini.classes.Employee;

public class EmpDeserialize {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin=new FileInputStream("emp");
		ObjectInputStream objin=new ObjectInputStream(fin);
		
		Employee obj=(Employee) objin.readObject();
		System.out.println(obj);
	}

}
