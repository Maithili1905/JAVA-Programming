/*
3. Write Java program which accept N numbers from user and display
all such elements which are even and divisible by 5.

Input : N : 6
Elements : 85 66 3 80 93 88
Output : 80*/

import java.lang.*;
import java.util.*;

 class Number
 {
	  void Divisible(int arr[],int value)
	  {
		  
		  for(int icnt = 0;icnt < value;icnt++)
		  {
			  if(((arr[icnt] % 2) == 0) && ((arr[icnt] % 5 ) == 0))
			  { 
		  
			     System.out.println(" divisible number is :" +arr[icnt]);
				 
			  }
		  }
	  }
 }
 class demo
 {
	 public static void main(String arg[])
	 {
		 Scanner sobj = new Scanner(System.in);
		  System.out.println("enter the value");
			 int value = sobj.nextInt();
			 
			 int arr[] = new int[value];
			 System.out.print("elements of array are");
			 for(int i =0;i < value;i++)
			 {
				 arr[i] = sobj.nextInt();
			 }
			 
			 Number nobj = new Number();
			  nobj.Divisible(arr,value);
			 
			 
	 }
 }
	 
