package com.nackademin.mahmoud_ataei_assignment02.classes;

import com.nackademin.mahmoud_ataei_assignment02.interfaces.AdvancedOperations;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {

	@Override
	public double square(double number) {

		return number * number;
	}

	@Override
	public double squareRoot(double number) {

		return Math.sqrt(number);
	}

	@Override
	public double raisedToThePowerOf(double base, double exponent) {

		return Math.pow(base, exponent);
	}

	@Override
	public double log(double number) {

		return Math.log(number);
	}

	@Override
	public double absluteValue(double number) {

		return Math.abs(number);
	}

}
