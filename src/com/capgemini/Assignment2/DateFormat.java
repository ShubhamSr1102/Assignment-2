package com.capgemini.Assignment2;

public class DateFormat {

	public static String changeFormat(String date) {
		String out="";
		int l=date.length();
		for(int i = 0; i < l ; i++)
		{
			char ch=date.charAt(i);
			if(ch == ',')
			{
				out = out + '/';
			}
			else
			{
				out = out + ch;
			}
		}
		String m = "" +  out.charAt(3) + out.charAt(4);
		int n = Integer.parseInt(m);
		String res="";
		switch(n)
		{
		case 1:
		res = out.substring(0, 3) + "January" + out.substring(5);
			//String newName = myName.substring(0,4)+'x'+myName.substring(5);
		break;
		case 2:
			res = out.substring(0, 3) + "February" + out.substring(5);	
			break;
		case 3:
			res = out.substring(0, 3) + "March" + out.substring(5);	
			break;
		case 4:
			res = out.substring(0, 3) + "April" + out.substring(5);	
			break;
		case 5:
			res = out.substring(0, 3) + "May" + out.substring(5);	
			break;
		case 6:
			res = out.substring(0, 3) + "June" + out.substring(5);	
			break;
		case 7:
			res = out.substring(0, 3) + "July" + out.substring(5);	
			break;
		case 8:
			res = out.substring(0, 3) + "August" + out.substring(5);	
			break;
		case 9:
			res = out.substring(0, 3) + "September" + out.substring(5);	
			break;
		case 10:
			res = out.substring(0, 3) + "October" + out.substring(5);	
			break;
		case 11:
			res = out.substring(0, 3) + "November" + out.substring(5);	
			break;
		case 12:
			res = out.substring(0, 3) + "December" + out.substring(5);	
			break;
		default:
			return "Wrong Date";
			
		}
		return res;
	}

}
