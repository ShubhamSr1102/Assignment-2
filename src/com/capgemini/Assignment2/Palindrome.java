package com.capgemini.Assignment2;

public class Palindrome 
{

	public static String check(String word) {
		Palindrome obj = new Palindrome();
		String str_rev = obj.rev(word);
		//System.out.println(str_rev);
		if(word.equals(str_rev))
		{
			return "Palindrome String";
		}
		else
			return "Not a Palindrome string";
	}

	private String rev(String word) {
		String rev="";
		for(int i = word.length()-1; i>=0; i--)
		{
			rev = rev + word.charAt(i);
		}
		return rev;
	}
}


