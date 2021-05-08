/*1. Write Java program which accept String from user and display
below pattern.
Input : Hello
Output : H e l l o
         H e l l o
         H e l l o
         H e l l o */

import java.lang.*;
import java.util.*;

  class Demostring
  {
	  void Pattern(String str)
	  {
		  char a[] = str.toCharArray();
		  int size = a.length;
		  int i = 0 , j = 0;
		  
		  System.out.println();
		  for(i = 0; i < a.length; i++)
		  {
			  for(j = 0; j < a.length; j++)
			  {
				  System.out.print(a[j]+ " ");
			  }
			  System.out.println();
		  }
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
		dobj.Pattern(str);
	 }
 }
	 
