package com.nackademin.mahmoud_ataei_assignment02;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nackademin.mahmoud_ataei_assignment02.classes.BasicCalculator;

public class BasicalculatorTest {

	BasicCalculator bc = new BasicCalculator();

	@Test
	public void testAddition() {
		assertEquals(bc.addition(2, 2), 4, 0);
	}

	@Test
	public void testSubtraction() {
		assertEquals(bc.subtraction(2, 2), 0, 0);
	}

	@Test
	public void testMultiplikation() {
		assertEquals(bc.multiplikation(10, 2), 20, 0);
	}

	@Test
	public void testDivisionn() {
		assertEquals(bc.division(40, 2), 20, 0);
	}
	
	
	
	
	
	
	
	
	
}
