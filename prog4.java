/*1. Write Java program which accept N numbers from user and return
difference between summation of even elements and summation of
odd elements.

Input : N : 6
Elements : 85 66 3 80 93 88
Output : 53 (234 - 181) */

import java.lang.*;
import java.util.*;

 class Number
 {
	  int Difference(int arr[],int value)
	  {
		  int even = 0 , odd = 0 , diff = 0;
		  for(int icnt = 0;icnt < value;icnt++)
		  {
			  if((arr[icnt] % 2) == 0)
			  {
				   even = even + arr[icnt];
			  }
			  else
			  {
				  odd = odd + arr[icnt];
			  }
			  
			  diff = even - odd;
		  }
		  return diff;
	  }
 }
 class demo
 {
	 public static void main(String arg[])
	 {
		 Scanner sobj = new Scanner(System.in);
		  System.out.println("emetr the value");
			 int value = sobj.nextInt();
			 
			 int arr[] = new int[value];
			 System.out.print("elements of array are");
			 for(int i =0;i < value;i++)
			 {
				 arr[i] = sobj.nextInt();
			 }
			 
			 Number nobj = new Number();
			 int ret = nobj.Difference(arr,value);
			 
			 System.out.println("difference is :" +ret);
	 }
 }
	 


