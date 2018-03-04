package com.rt.mavensample;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{

	Calculator cal = new Calculator();

	@Test
	public void testadd() {
		assertEquals(0,cal.add(1,-1));	
	}
	
	@Test
	public void testsubtract() {
		assertEquals(-18,cal.subtract(-14,4));
		
	}

}
