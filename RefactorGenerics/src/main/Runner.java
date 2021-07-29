package main;

import classes.DoubleClass;
import classes.Generic;
import classes.IntegerClass;
import classes.StringClass;

public class Runner {

	public static void main(String[] args) {
		Generic<Integer> i = new Generic<Integer>(36);
		Generic<Double> dub = new Generic<Double>(36d);
		Generic<String> str = new Generic<String>("Thirty Six");
		
		
		
//		DoubleClass dub = new DoubleClass(36d);
//		IntegerClass i = new IntegerClass(36);
//		StringClass str = new StringClass("Thirty Six");

		str.print();
		i.getType();
		dub.print();

	}

}
