package com.bridgelabs.generic;

import org.junit.Test;

import junit.framework.Assert;

public class MaximumValueTest {
	MaximumValue maximum = new MaximumValue();
	
	@Test
	public void shouldReturnMaximumAtFirstSpot() {
		int value = maximum.findMaximum(70, 56, 30);
		Assert.assertEquals(70, value);
	}
	
	@Test
	public void shouldReturnMaximumAtSecondSpot() {
		int value = maximum.findMaximum(56, 70, 30);
		Assert.assertEquals(70, value);
	}
	
	@Test
	public void shouldReturnMaximumAtThirdSpot() {
		int value = maximum.findMaximum(30, 56, 70);
		Assert.assertEquals(70, value);
	}

}
