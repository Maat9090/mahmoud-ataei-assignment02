package com.nackademin.mahmoud_ataei_assignment02;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.nackademin.mahmoud_ataei_assignment02.classes.BasicCalculator;

public class BasicalculatorTest {

	BasicCalculator bc = new BasicCalculator();
	Random random = new Random();

	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());

	@Test
	public void testAdditionZero() {
		double temFirstNumber = 0.0;
		double tmpSecondNumber = 0.0;

		LOG.info("Testning The method addition with the values: " + temFirstNumber + " and " + tmpSecondNumber);
		assertEquals(bc.addition(temFirstNumber, tmpSecondNumber), 0, 0);

	}

	@Test
	public void testAdditionPositive() {
		double temFirstNumber = 0.0;
		double tmpSecondNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temFirstNumber = random.nextDouble();
			tmpSecondNumber = random.nextDouble();
			tmpExpectedResult = temFirstNumber + tmpSecondNumber;

			LOG.info("Testning The method addition with the values: " + temFirstNumber + " and " + tmpSecondNumber);
			assertEquals(bc.addition(temFirstNumber, tmpSecondNumber), tmpExpectedResult, 0);
		}
	}

	@Test
	public void testAdditionNegative() {
		double temFirstNumber = 0.0;
		double tmpSecondNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temFirstNumber = random.nextDouble() * -1;
			tmpSecondNumber = random.nextDouble();
			tmpExpectedResult = temFirstNumber + tmpSecondNumber;

			LOG.info("Testning The method addition with the values: " + temFirstNumber + " and " + tmpSecondNumber);
			assertEquals(bc.addition(temFirstNumber, tmpSecondNumber), tmpExpectedResult, 0);
		}
	}

	@Test
	public void testSubtractionZero() {
		double temFirstNumber = 0.0;
		double tmpSecondNumber = 0.0;

		LOG.info("Testning The method subtraction with the values: " + temFirstNumber + " and " + tmpSecondNumber);
		assertEquals(bc.subtraction(temFirstNumber, tmpSecondNumber), 0, 0);
	}

	@Test
	public void testSubtractionPositive() {

		double temFirstNumber = 0.0;
		double tmpSecondNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temFirstNumber = random.nextDouble();
			tmpSecondNumber = random.nextDouble();
			tmpExpectedResult = temFirstNumber - tmpSecondNumber;

			LOG.info("Testning The method subtraction with the values: " + temFirstNumber + " and " + tmpSecondNumber);
			assertEquals(bc.subtraction(temFirstNumber, tmpSecondNumber), tmpExpectedResult, 0);
		}
	}

	@Test
	public void testSubtractionNegative() {

		double temFirstNumber = 0.0;
		double tmpSecondNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temFirstNumber = random.nextDouble() * -1;
			tmpSecondNumber = random.nextDouble();
			tmpExpectedResult = temFirstNumber - tmpSecondNumber;

			LOG.info("Testning The method subtraction with the values: " + temFirstNumber + " and " + tmpSecondNumber);
			assertEquals(bc.subtraction(temFirstNumber, tmpSecondNumber), tmpExpectedResult, 0);
		}
	}

	@Test
	public void testMultiplikationZero() {

		double temFirstNumber = 0.0;
		double tmpSecondNumber = 0.0;

		LOG.info("Testning The method multiplikation with the values: " + temFirstNumber + " and " + tmpSecondNumber);
		assertEquals(bc.multiplikation(temFirstNumber, tmpSecondNumber), 0, 0);
	}

	@Test
	public void testMultiplikationPositive() {

		double temFirstNumber = 0.0;
		double tmpSecondNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temFirstNumber = random.nextDouble();
			tmpSecondNumber = random.nextDouble();
			tmpExpectedResult = temFirstNumber * tmpSecondNumber;

			LOG.info("Testning The method multiplikation with the values: " + temFirstNumber + " and "
					+ tmpSecondNumber);
			assertEquals(bc.multiplikation(temFirstNumber, tmpSecondNumber), tmpExpectedResult, 0);
		}

	}

	@Test
	public void testMultiplikationNegative() {

		double temFirstNumber = 0.0;
		double tmpSecondNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temFirstNumber = random.nextDouble() * -1;
			tmpSecondNumber = random.nextDouble();
			tmpExpectedResult = temFirstNumber * tmpSecondNumber;

			LOG.info("Testning The method multiplikation with the values: " + temFirstNumber + " and "
					+ tmpSecondNumber);
			assertEquals(bc.multiplikation(temFirstNumber, tmpSecondNumber), tmpExpectedResult, 0);

		}
	}

	@Test
	public void testDivisionnPositive() {

		double temFirstNumber = 0.0;
		double tmpSecondNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 10; i++) {

			temFirstNumber = random.nextDouble();
			tmpSecondNumber = random.nextDouble();
			tmpExpectedResult = temFirstNumber / tmpSecondNumber;

			LOG.info("Testning The method division with the values: " + temFirstNumber + " and " + tmpSecondNumber);
			assertEquals(bc.division(temFirstNumber, tmpSecondNumber), tmpExpectedResult, 0);
		}
	}

	@Test
	public void testDivisionnNegative() {

		double temFirstNumber = 0.0;
		double tmpSecondNumber = 0.0;
		double tmpExpectedResult = 0.0;

		for (int i = 0; i < 1000; i++) {

			temFirstNumber = random.nextDouble() * -1;
			tmpSecondNumber = random.nextDouble();
			tmpExpectedResult = temFirstNumber / tmpSecondNumber;

			LOG.info("Testning The method division with the values: " + temFirstNumber + " and " + tmpSecondNumber);
			assertEquals(bc.division(temFirstNumber, tmpSecondNumber), tmpExpectedResult, 0);
		}

	}

}
