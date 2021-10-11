package com.bridgelabs.generic;

import org.junit.Test;

import junit.framework.Assert;

public class MaximumValueTest {
	
	@Test
	public void shouldReturnMaximumAtFirstSpot() {
		System.out.println();
		int value = new MaximumValue<Integer>(70, 56, 30).findMaximum();
		Assert.assertEquals(70, value);
		float number = new MaximumValue<Float>(70.0f, 56.0f, 30.0f).findMaximum();
		Assert.assertEquals(70.0f, number, 0.0f);
		String string = new MaximumValue<String>("peach", "apple", "banana").findMaximum();
		Assert.assertEquals("peach", string);
	}
	
	@Test
	public void shouldReturnMaximumAtSecondSpot() {
		System.out.println();
		int value = new MaximumValue<Integer>(56, 70, 30).findMaximum();
		Assert.assertEquals(70, value);
		float number = new MaximumValue<Float>(56.0f, 70.0f, 30.0f).findMaximum();
		Assert.assertEquals(70.0f, number, 0.0f);
		String string = new MaximumValue<String>("banana", "peach", "apple").findMaximum();
		Assert.assertEquals("peach", string);
	}
	
	@Test
	public void shouldReturnMaximumAtThirdSpot() {
		System.out.println();
		int value = new MaximumValue<Integer>(30, 56, 70).findMaximum();
		Assert.assertEquals(70, value);
		float number = new MaximumValue<Float>(30.0f, 56.0f, 70.0f).findMaximum();
		Assert.assertEquals(70.0f, number, 0.0f);
		String string = new MaximumValue<String>("apple", "banana", "peach").findMaximum();
		Assert.assertEquals("peach", string);
	}

}
