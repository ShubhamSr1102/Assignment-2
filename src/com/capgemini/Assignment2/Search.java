package com.capgemini.Assignment2;

public class Search {

	public static int findNumber(int number) {
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(int i=0;i<15;i++)
		{
			if(number==arr[i])
			{
				System.out.println("Number found at position = " + (i+1));
				return 1;
			}
		}
		System.out.println("Number not found");
		return 0;
	}

}
