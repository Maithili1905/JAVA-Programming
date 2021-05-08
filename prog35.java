/*Write a program which 2 strings from user and check whether 
contents of two strings are equal or not. 

Input : “Marvellous Infosystems” 
         “Marvellous Infosystems” 

Output : TRUE*/

import java.lang.*;
import java.util.*;


class str
{
	public boolean check(String src, String desc)
	{
		
		if(src.equals(desc))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}

		

class demo
{
	public static void main(String Arg[])
	{
		Scanner sobj = new Scanner(System.in);
		boolean bret = false;
		
		System.out.println("enter the string");
		String src = sobj.nextLine();
		
		System.out.println("enter the string");
		String desc = sobj.nextLine();
		
		str dobj = new str();
		
		bret = dobj.check(src,desc);
		
		if(bret == true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
		
		
		
		
