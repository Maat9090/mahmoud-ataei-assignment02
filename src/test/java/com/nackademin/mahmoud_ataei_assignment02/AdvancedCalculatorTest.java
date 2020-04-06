package com.nackademin.mahmoud_ataei_assignment02;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nackademin.mahmoud_ataei_assignment02.classes.AdvancedCalculator;

public class AdvancedCalculatorTest {

	AdvancedCalculator ac = new AdvancedCalculator();

	@Test
	public void testSquare() {
		assertEquals(ac.square(3), 9, 0);
	}

	@Test
	public void testSquareRoot() {
		assertEquals(ac.squareRoot(16), 4, 0);
	}

	@Test
	public void testRaisedToThePowerOf() {
		assertEquals(ac.raisedToThePowerOf(2, 4), 16, 0);
	}

	@Test
	public void testLog() {
		assertEquals(ac.log(16), 2.772588722239781, 0);
	}

	@Test
	public void testAbsluteValue() {
		assertEquals(ac.absluteValue(-12), 12, 0);
	}
	
	
}
