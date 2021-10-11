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
	/**
	 * Creating method findMaximum which return Float value
	 * @param firstValue
	 * @param secondValue
	 * @param thirdValue
	 * @return
	 */
	public Float findMaximum(Float firstValue, Float secondValue, Float thirdValue) {
		Float maximum = firstValue;
		if(secondValue.compareTo(maximum)> 0) {
			maximum = secondValue;
		}
		if(thirdValue.compareTo(maximum)> 0) {
			maximum = thirdValue;
		}
		System.out.println("Maximum Float number is " + maximum);
		return maximum;
		
	}
	/**
	 * Creating method findMaximum which return String
	 * @param firstValue
	 * @param secondValue
	 * @param thirdValue
	 * @return
	 */
	public String findMaximum(String firstValue, String secondValue, String thirdValue) {
		String maximum = firstValue;
		if (secondValue.compareTo(maximum) > 0) {
            maximum = secondValue;
        }
        if (thirdValue.compareTo(maximum) > 0) {
            maximum = thirdValue;
        }
        System.out.println("Maximum String number is " + maximum);
        return maximum;
    }		
}