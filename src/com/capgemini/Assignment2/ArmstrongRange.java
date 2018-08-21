package com.capgemini.Assignment2;

public class ArmstrongRange {
	public static int[] findAllArmstrongNumbers(int start, int end) {
		int number;
		int digit;
		int sum;
		int allArmstrongNumbers[] = new int[10];
		int index = 0;
		for(int i = start; i <= end; i++) {
			number = i;
			sum = 0;
			while(number != 0) {
				digit = number % 10;
				sum = sum + digit * digit * digit;
				number = number / 10;
			}
			if(sum == i)
				allArmstrongNumbers[index++] = i;
		}
		return allArmstrongNumbers;
	}

}
