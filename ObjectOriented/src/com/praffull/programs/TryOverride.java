package com.praffull.programs;

import com.sharayu.classes.Praffull;
import com.sharayu.classes.Sharayu;

public class TryOverride {
	public static void main(String[] args) {
		/*
		Sharayu s=new Sharayu();
		s.show();
		s.show();
		*/
		
		Praffull p=new Praffull();
		Sharayu s=new Sharayu();
		Praffull ref;
		ref=p;
		ref.show();
		ref=s;
		ref.show();
	}

}
