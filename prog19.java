/*
 1.Write a Java program which accept string from user and count
number of capital characters.

Input : “Marvellous Multi OS”

Output : 4
 */
 
 

import java.lang.*;
import java.util.*;
 
 class Demostring
 {
	 int CountCaptials(String str)
	 {
		char arr[] = str.toCharArray();
		int size = arr.length;
		 int i = 0, icnt = 0;
		 
		 while(i < size)
		 {
			 
			if((arr[i] >= 'A') && (arr[i] <= 'Z')) 
			{
				icnt++;
			}
			i++;
		 }
		 return icnt;
	 }
 }

 class demo
 {
	 public static void main(String arg[])
	 {
		 Scanner sobj = new Scanner(System.in);
		 
		 System.out.println("enter the string");
		 String str = sobj.nextLine();
		 
		 Demostring dobj = new Demostring();
		 
		 int ret = dobj.CountCaptials(str);
		 
		 System.out.println("count is :" +ret);
	 }
 }
