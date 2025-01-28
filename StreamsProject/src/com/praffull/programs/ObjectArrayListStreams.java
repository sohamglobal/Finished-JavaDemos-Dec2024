package com.praffull.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.sharayu.classes.Film;

public class ObjectArrayListStreams {
	public static void main(String[] args) {
		Film f1=new Film("the matrix", 1999, "action", "english", 8.7);
		Film f2=new Film("pk", 2014, "comedy", "hindi", 8.4);
		Film f3= new Film("3 Idiots", 2009, "Comedy", "Hindi", 8.4);
        Film f4 = new Film("Dangal", 2016, "Biography-Drama", "Hindi", 8.4);
        Film f5 = new Film("Sholay", 1975, "Action", "Hindi", 8.1);
        Film f6 = new Film("Lagaan", 2001, "Drama", "Hindi", 8.1);
        Film f7 = new Film("Dilwale Dulhania Le Jayenge", 1995, "Romance", "Hindi", 8.0);
        Film f8 = new Film("Taare Zameen Par", 2007, "Drama", "Hindi", 8.4);
        Film f9 = new Film("Barfi!", 2012, "Comedy", "Hindi", 8.1);
		
		List<Film> lst=new ArrayList<Film>();
		lst.add(f1);
		lst.add(f2);
		lst.add(f3);
		lst.add(f4);
		lst.add(f5);
		lst.add(f6);
		lst.add(f7);
		lst.add(f8);
		lst.add(f9);
		
		//System.out.println(lst);
		lst.stream().forEach(t->System.out.println(t));
		System.out.println("-------------------------");
		long cnt=lst.stream().filter(t->t.getGenre().equalsIgnoreCase("action")).count();
		System.out.println("total action films : "+cnt);
		lst.stream().map(t->t.getRelyear()+1).toList().forEach(t->System.out.println(t));
		System.out.println(lst);
		List<Film> res=lst.stream().sorted(Comparator.comparing(Film::getFilmname)).collect(Collectors.toList());
		System.out.println(res);
		
	}

}
