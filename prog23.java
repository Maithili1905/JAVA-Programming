/*5. Write a java program which accept string from user and display 
it in reverse order. 

Input : “MarvellouS” 
Output : “SuollevraM"*/

import java.lang.*;
import java.util.*;


class Number
{
	void chck(String str)
	{
		char arr[] = str.toCharArray();
		String rev = " ";
		
		int size = arr.length;
		
		for(int i = size - 1; i >= 0; i--)
		{
			rev+= arr[i];
		}
		
		System.out.println("reverse string is:"+rev);
	}
}

			

class manu
{
	public static void main(String Arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("enter the strng");
		String str = sobj.nextLine();
		
		Number nobj = new Number();
		
		nobj.chck(str);
		
	}
}
         		 
