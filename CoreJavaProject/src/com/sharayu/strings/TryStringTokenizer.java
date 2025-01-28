package com.sharayu.strings;

import java.util.StringTokenizer;

public class TryStringTokenizer {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("you will never walk alone");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		String data="pk,2014,comedy,rajkumar hirani,amir khan,india,hindi,8.7";
		StringTokenizer film=new StringTokenizer(data,",");
		System.out.println("---------------");
		
		while(film.hasMoreTokens())
			System.out.println(film.nextToken());
		
	}

}
