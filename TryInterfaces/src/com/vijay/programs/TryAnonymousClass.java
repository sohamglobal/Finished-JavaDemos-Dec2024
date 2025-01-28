package com.vijay.programs;

import com.praffull.interfaces.Sports;

public class TryAnonymousClass {
	public static void main(String[] args) {
		//Style-2 anonymous class
		
				Sports s=new Sports() {
					@Override
					public String showFitness(String playernm)
					{
						return playernm+" is fit to play";
					}
				};
				System.out.println(s.showFitness("virgil van dijk"));
	}

}
