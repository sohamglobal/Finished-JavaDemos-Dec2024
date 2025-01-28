package com.sharayu.beans;

import java.util.ArrayList;
import java.sql.*;

public class AllFilmsList {
	private ArrayList<Film> flist;
	
	public AllFilmsList()
	{
		flist=new ArrayList<>();
		Film obj;
		
		Connection con;
		Statement st;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			st=con.createStatement();
			rs=st.executeQuery("select * from films");
			
			while(rs.next())
			{
				obj=new Film();
				obj.setFilmid(rs.getInt("filmid"));
				obj.setFilmname(rs.getString("filmname"));
				obj.setRelyear(rs.getInt("relyear"));
				obj.setGenre(rs.getString("genre"));
				obj.setLanguage(rs.getString("language"));
				obj.setImdbrating(rs.getFloat("imdbrating"));
				flist.add(obj);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public ArrayList<Film> getFlist() {
		return flist;
	}
	
	
	

}
