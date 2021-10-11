package com.bridgelabs.generic;

public class  MaximumValue <T extends Comparable<T>>{
	
	T firstValue,secondValue,thirdValue;
	/**
	 *creating parametertised constructor 
	 * @param firstValve
	 * @param secondValve
	 * @param thirdValve
	 */
	public MaximumValue(T firstValue, T secondValue, T thirdValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}
	/**
	 * 
	 * @param <T>
	 * @param firstValue
	 * @param secondValue
	 * @param thirdValue
	 * @return
	 */
	public static <T extends Comparable<T>> T testMaximum(T firstValue, T secondValue, T thirdValue) {
	T maximum = firstValue;
	if(secondValue.compareTo(maximum)> 0) {
		maximum = secondValue;
	}
	if(thirdValue.compareTo(maximum)> 0) {
		maximum = thirdValue;
	}
	System.out.println("Maximum number is " + maximum);
	return maximum;
	}
	
	public T findMaximum() {
		return MaximumValue.testMaximum(firstValue, secondValue, thirdValue);
				
	}
}