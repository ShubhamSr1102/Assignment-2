package com.capgemini.Assignment2;

public class Result {

	public static String grade(int subjectOne, int subjectTwo, int subjectThree) {
		if(subjectOne > 60 && subjectTwo>60 && subjectThree>60)
		{
			return "Passed";
		}
		else if(subjectOne > 60 && subjectTwo>60 || subjectOne > 60 && subjectThree>60 || subjectTwo > 60 && subjectThree>60)
		{
			return "Promoted";
		}
		else
		{
			return "Failed";
		}
	}

}
