package com.nackademin.mahmoud_ataei_assignment02;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.nackademin.mahmoud_ataei_assignment02.classes.AdvancedCalculator;
//import com.nackademin.mahmoud_ataei_assignment02.classes.BasicCalculator;

public class AdvancedCalculatorTest {

	AdvancedCalculator ac = new AdvancedCalculator();
	Random random = new Random();

	public static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());

//-----------------Square---------------------

	@Test
	public void testSquarePositive() {

		double temNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10000; i++) {

			temNumber = random.nextDouble();
			tmpExpectedResult = temNumber * temNumber;

			LOG.info("Testning The method square with the values: " + temNumber);
			assertEquals(ac.square(temNumber), tmpExpectedResult, 0);
		}

	}

	@Test
	public void testSquareNegative() {

		double temNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temNumber = random.nextDouble() * (-1);
			tmpExpectedResult = temNumber * temNumber;

			LOG.info("Testning The method square with the values: " + temNumber);
			assertEquals(ac.square(temNumber), tmpExpectedResult, 0);
		}
	}

//-----------------SquareRoot---------------------

	@Test
	public void testSquareRootZero() {
		assertEquals(ac.squareRoot(0), 0, 0);
	}

	@Test
	public void testSquareRootPositive() {
		double temNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temNumber = random.nextDouble();
			tmpExpectedResult = Math.sqrt(temNumber);
			;

			LOG.info("Testning The method squareRoot with the values: " + temNumber);
			assertEquals(ac.squareRoot(temNumber), tmpExpectedResult, 0);
		}
	}

//-----------------Log---------------------

	@Test
	public void testLog() {
		assertEquals(ac.log(Math.E), 1, 0);
	}

	@Test
	public void testLogPositive() {
		double temNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temNumber = random.nextDouble();
			tmpExpectedResult = Math.log(temNumber);

			LOG.info("Testning The method log with the values: " + temNumber);
			assertEquals(ac.log(temNumber), tmpExpectedResult, 0);
		}

	}

//-----------------RaisedToThePowerOf---------------------

	@Test
	public void TestRaisedToThePowerOfPositive() {

		double temFirstNumber = 0.0;
		double tmpSecondNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temFirstNumber = random.nextDouble();
			tmpSecondNumber = random.nextDouble();
			tmpExpectedResult = Math.pow(temFirstNumber, tmpSecondNumber);

			LOG.info("Testning The method raisedToThePowerOf with the values: " + temFirstNumber + " and "
					+ tmpSecondNumber);
			assertEquals(ac.raisedToThePowerOf(temFirstNumber, tmpSecondNumber), tmpExpectedResult, 0);
		}

	}

	@Test
	public void TestRaisedToThePowerOfNegative() {

		double temFirstNumber = 0.0;
		double tmpSecondNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temFirstNumber = random.nextDouble() * -1;
			tmpSecondNumber = random.nextDouble();
			tmpExpectedResult = Math.pow(temFirstNumber, tmpSecondNumber);

			LOG.info("Testning The method raisedToThePowerOf with the values: " + temFirstNumber + " and "
					+ tmpSecondNumber);
			assertEquals(ac.raisedToThePowerOf(temFirstNumber, tmpSecondNumber), tmpExpectedResult, 0);
		}

	}
//-----------------AbsluteValue---------------------

	@Test
	public void testAbsluteValueZero() {
		assertEquals(ac.absluteValue(0), 0, 0);
	}

	@Test
	public void testAbsluteValuePositive() {

		double temNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temNumber = random.nextDouble();
			tmpExpectedResult = Math.abs(temNumber);

			LOG.info("Testning The method absluteValue with the values: " + temNumber);
			assertEquals(ac.absluteValue(temNumber), tmpExpectedResult, 0);
		}

	}

	@Test
	public void testAbsluteValueNegative() {

		double temNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temNumber = random.nextDouble() * (-1);
			tmpExpectedResult = Math.abs(temNumber);

			LOG.info("Testning The method absluteValue with the values: " + temNumber);
			assertEquals(ac.absluteValue(temNumber), tmpExpectedResult, 0);
		}

	}

}
