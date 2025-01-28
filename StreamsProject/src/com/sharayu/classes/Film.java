package com.sharayu.classes;

public class Film{
	private String filmname;
	private int relyear;
	private String genre;
	private String language;
	private double imdbrating;
	
	public Film(String filmname, int relyear, String genre, String language, double imdbrating) {
		super();
		this.filmname = filmname;
		this.relyear = relyear;
		this.genre = genre;
		this.language = language;
		this.imdbrating = imdbrating;
	}

	public String getFilmname() {
		return filmname;
	}

	public int getRelyear() {
		return relyear;
	}

	public String getGenre() {
		return genre;
	}

	public String getLanguage() {
		return language;
	}

	public double getImdbrating() {
		return imdbrating;
	}

	@Override
	public String toString() {
		return "Film [filmname=" + filmname + ", relyear=" + relyear + ", genre=" + genre + ", language=" + language
				+ ", imdbrating=" + imdbrating + "]";
	}
	
	

}
