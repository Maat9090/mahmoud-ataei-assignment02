package com.nackademin.mahmoud_ataei_assignment02.classes;

import com.nackademin.mahmoud_ataei_assignment02.interfaces.BasicOperations;

public class BasicCalculator implements BasicOperations {

	@Override
	public double addition(double firstNumber, double secondNumber) {

		return firstNumber + secondNumber;
	}

	@Override
	public double subtraction(double firstNumber, double secondNumber) {

		return firstNumber - secondNumber;
	}

	@Override
	public double multiplikation(double firstNumber, double secondNumber) {

		return firstNumber * secondNumber;
	}

	@Override
	public double division(double firstNumber, double secondNumber) {

		return firstNumber / secondNumber;
	}

}
