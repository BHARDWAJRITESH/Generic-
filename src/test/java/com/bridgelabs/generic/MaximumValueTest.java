package com.bridgelabs.generic;

import org.junit.Test;

import junit.framework.Assert;

public class MaximumValueTest {
	MaximumValue maximum = new MaximumValue();
	
	@Test
	public void shouldReturnMaximumAtFirstSpot() {
		int value = maximum.findMaximum(70, 56, 30);
		Assert.assertEquals(70, value);
		float number = maximum.findMaximum(70.0f, 56.0f, 30.0f);
		Assert.assertEquals(70.0f, number, 0.0f);
		String string = maximum.findMaximum("peach", "apple", "banana");
		Assert.assertEquals("peach", string);
	}
	
	@Test
	public void shouldReturnMaximumAtSecondSpot() {
		int value = maximum.findMaximum(56, 70, 30);
		Assert.assertEquals(70, value);
		float number = maximum.findMaximum(56.0f, 70.0f, 30.0f);
		Assert.assertEquals(70.0f, number, 0.0f);
		String string = maximum.findMaximum("banana", "peach", "apple");
		Assert.assertEquals("peach", string);
	}
	
	@Test
	public void shouldReturnMaximumAtThirdSpot() {
		int value = maximum.findMaximum(30, 56, 70);
		Assert.assertEquals(70, value);
		float number = maximum.findMaximum(30.0f, 56.0f, 70.0f);
		Assert.assertEquals(70.0f, number, 0.0f);
		String string = maximum.findMaximum("apple", "banana", "peach");
		Assert.assertEquals("peach", string);
	}

}
