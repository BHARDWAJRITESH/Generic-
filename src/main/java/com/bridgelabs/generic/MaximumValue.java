package com.bridgelabs.generic;

public class  MaximumValue {
	public <T extends Comparable<T>> T findMaximum(T firstValue, T secondValue, T thirdValue) {
	T maximum = firstValue;
	if(secondValue.compareTo(maximum)> 0) {
		maximum = secondValue;
	}
	if(thirdValue.compareTo(maximum)> 0) {
		maximum = thirdValue;
	}
	System.out.println("Maximum Integer number is " + maximum);
	return maximum;
	}
}