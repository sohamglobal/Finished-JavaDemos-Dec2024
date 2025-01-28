package com.praffull.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.sharayu.beans.FilmServices;

/**
 * Servlet implementation class AddFilm
 */
public class AddFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFilm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fnm,gen,lan;
		int ryr;
		float rat;
		fnm=request.getParameter("filmname");
		ryr=Integer.parseInt(request.getParameter("relyear"));
		gen=request.getParameter("genre");
		lan=request.getParameter("language");
		rat=Float.parseFloat(request.getParameter("imdbrating"));
		
		FilmServices fs=new FilmServices();
		fs.setFilmname(fnm);
		fs.setRelyear(ryr);
		fs.setGenre(gen);
		fs.setLanguage(lan);
		fs.setImdbrating(rat);
		
		String stat=fs.getStatus();
		System.out.println(stat);
	}

}
