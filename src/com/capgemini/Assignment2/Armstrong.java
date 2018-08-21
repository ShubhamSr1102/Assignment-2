package com.capgemini.Assignment2;

public class Armstrong {

	public static int checkArmstrong(int number) {
		int copyNumber = number;
		int sum=0;
		while(number>0)
		{
			int d = number % 10;
			sum = sum + d*d*d;
			number=number/10;
		}
		if(sum == copyNumber)
		{
			System.out.println(copyNumber + " is an Armstrong Number");
			return 1;
		}
		else
		{
			System.out.println(copyNumber + " is not an Armstrong Number");
			return 0;
		}
	}

}
