package com.sharayu.beans;

public class Film {
	private int filmid;
	private String filmname;
	private int relyear;
	private String genre;
	private String language;
	private float imdbrating;
	
	public Film()
	{
		filmid=0;
		filmname="Not found";
		relyear=0;
		genre="na";
		language="na";
		imdbrating=0;
	}

	public int getFilmid() {
		return filmid;
	}

	public void setFilmid(int filmid) {
		this.filmid = filmid;
	}

	public String getFilmname() {
		return filmname;
	}

	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}

	public int getRelyear() {
		return relyear;
	}

	public void setRelyear(int relyear) {
		this.relyear = relyear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public float getImdbrating() {
		return imdbrating;
	}

	public void setImdbrating(float imdbrating) {
		this.imdbrating = imdbrating;
	}

	@Override
	public String toString() {
		return "Film [filmid=" + filmid + ", filmname=" + filmname + ", relyear=" + relyear + ", genre=" + genre
				+ ", language=" + language + ", imdbrating=" + imdbrating + "]";
	}
	
	

}
