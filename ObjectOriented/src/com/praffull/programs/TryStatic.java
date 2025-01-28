package com.praffull.programs;

import com.sharayu.classes.Ashwini;

public class TryStatic {
	public static void main(String[] args) {
		Ashwini x=new Ashwini();
		x.setUsernm("grace");
		Ashwini.showMessage("welcome to F1 racing");
		Ashwini.showMessage("thanks ONE");
		
		Ashwini y=new Ashwini();
		y.setUsernm("ethan hunt");
		x.showMessage("sorry for the delay");
		
	}

}
