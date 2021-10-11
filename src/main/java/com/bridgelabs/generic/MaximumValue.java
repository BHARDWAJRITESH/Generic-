package com.bridgelabs.generic;

public class  MaximumValue {
	/**
	 * Creating method findMaximum
	 * @param firstValue
	 * @param secondValue
	 * @param thirdValue
	 * @return
	 */
	public Integer findMaximum(Integer firstValue, Integer secondValue, Integer thirdValue) {
		Integer maximum = firstValue;
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