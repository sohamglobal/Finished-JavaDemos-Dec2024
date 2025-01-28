package com.praffull.classes;

import com.praffull.interfaces.Sports;

public class Football implements Sports {

	@Override
	public String showFitness(String playernm) {
		// TODO Auto-generated method stub
		return playernm+" is fully fit to play todays game";
	}

}
