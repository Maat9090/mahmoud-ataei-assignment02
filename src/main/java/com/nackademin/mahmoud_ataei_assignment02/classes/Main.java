package com.nackademin.mahmoud_ataei_assignment02.classes;

public class Main {

	public static void main(String[] args) {

		BasicCalculator bc = new BasicCalculator();
		System.out.println(bc.addition(20, 2));
		System.out.println(bc.multiplikation(10, 10));
		System.out.println(bc.subtraction(100, 4.5));
		System.out.println(bc.division(20, 2));

		System.out.println("==============");

		AdvancedCalculator ac = new AdvancedCalculator();
		System.out.println("Square = " + ac.square(2));
		System.out.println("division = " + ac.division(22, 10));
		System.out.println("squareRoot = " + ac.squareRoot(16));
		System.out.println("raised To The Power Of = "+ ac.raisedToThePowerOf(2, 4));
		System.out.println("log = " + ac.log(16));
		System.out.println("abslute Value = "+ ac.absluteValue(-12));

	}

}
