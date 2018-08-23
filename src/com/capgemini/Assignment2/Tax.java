package com.capgemini.Assignment2;

public class Tax {

	public static double calculate(int income) {
		double tax=0;
		int temp;
		if(income > 0 && income <= 180000)
		{
			return 0;
		}
		else if(income > 180000 && income <= 300000)
		{
			temp = income - 180000;
			tax= temp * 0.1;
			return tax;
		}
		else if(income > 300000 && income <= 500000)
		{
			temp = income - 300000;
			tax= temp * 0.2 + 120000 * 0.1;
			return tax;
		}
		else if(income > 500000 && income <= 1000000)
		{
			temp = income - 500000;
			tax= temp * 0.3 + 120000 * 0.1 + 200000 * 0.2;
			return tax;
		}
		else
		{
			return -1;
		}
	}

}
