package com.sharayu.beans;
import java.sql.*;

public class FilmServices {
	private String filmname;
	private int relyear;
	private String genre;
	private String language;
	private float imdbrating;
	private String status;
	public String getStatus() {
		insertFilm();
		return status;
	}
	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}
	public void setRelyear(int relyear) {
		this.relyear = relyear;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setImdbrating(float imdbrating) {
		this.imdbrating = imdbrating;
	}
	
	private void insertFilm()
	{
		Connection con;
		PreparedStatement pst;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-javaee-project.c.aivencloud.com:19179/sharayudb?user=avnadmin&password=AVNS_TEZ17S2CIEzgqRcBnb0");
			pst=con.prepareStatement("insert into films(filmname,relyear,genre,language,imdbrating) values(?,?,?,?,?)");
			pst.setString(1,filmname);
			pst.setInt(2, relyear);
			pst.setString(3, genre);
			pst.setString(4, language);
			pst.setFloat(5, imdbrating);
			pst.executeUpdate();
			status="success";
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			status="error";
		}
		
	}
	
	

}
