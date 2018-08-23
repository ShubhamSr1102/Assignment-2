package com.capgemini.Assignment2;

public class Interest 
{

	public static double simple(double principal, double rate, double time) 
	{
		double interest=(principal * rate * time)/100;
		return interest;
	}

	public static double compound(double principal, double rate, double time) 
	{
		double interest = principal * Math.pow((1 + rate * 0.01), time); // ((P*(1+r/100)^t) - P)
		interest = interest - principal;
		return interest;
	}
}

