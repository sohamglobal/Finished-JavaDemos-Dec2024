package com.praffull.programs;
import com.sharayu.classes.*;

public class ShowSquare {
	public static void main(String[] args) {
		SquareCalculator obj=new SquareCalculator();
		//obj.square=25; cant access as it is private
		
		obj.calcSquare(9);
		obj.showSquare();
		
		obj.calcSquare(13);
		obj.showSquare();
		
		obj.calcSquare(25);
		obj.showSquare();
	}

}
