package com.capgemini.Assignment2;

public class PalindromeCount {

	public static String[] findPalindromes(String[] words) {
		PalindromeCount obj = new PalindromeCount();
		String palindromeWords[] = new String[10];
		int palindromeCount=0;
		for(int i = 0; i < 10; i++)
		{
			
			String wordRev = obj.rev(words[i]);
			if(words[i].equals(wordRev))
			{
				palindromeWords[palindromeCount]=words[i];
				palindromeCount++;
			}
		}
			
		String temp;
		for(int i = 0; i < palindromeCount-1; i++)
		{
			for(int j = 0; j < palindromeCount-i-1; j++)
			{
				if(palindromeWords[j].length() < palindromeWords[j+1].length())
				{
					temp = palindromeWords[j];
					palindromeWords[j] = palindromeWords[j+1];
					palindromeWords[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted Palindromes in descending order are ");
		for(int i = 0; i < palindromeCount; i++)
		{
			System.out.print(palindromeWords[i] + " ");
		}
		
		return palindromeWords;
	}
	String rev(String word)
	{
		String rev="";
		for(int i=word.length()-1; i>=0; i--)
		{
			rev = rev + word.charAt(i);
		}
		return rev;
	}
		
	}
