package com.sharayu.classes;

public class Ashwini {
	
	private static String usernm;
	
	public void setUsernm(String usernm)
	{
		this.usernm=usernm;
	}
	
	public static void showMessage(String msg)
	{
		System.out.println(usernm+", "+msg.toUpperCase());
	}

}
