ASSIGNMENT 53
(problems on array)


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
	 




/*
2. Write Java program which accept N numbers from user and display
all such elements which are divisible by 5.
Input : N : 6
Elements : 85 66 3 80 93 88
Output : 85 80 */

import java.lang.*;
import java.util.*;

 class Number
 {
	  void Divisible(int arr[],int value)
	  {
		  
		  for(int icnt = 0;icnt < value;icnt++)
		  {
			  if((arr[icnt] % 5) == 0)
			  { 
		  
			     System.out.println("number divisible by 5 is :" +arr[icnt]);
				 
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
	 

/*
4. Write Java program which accept N numbers from user and display
all such elements which are divisible by 3 and 5.

Input : N : 6
Elements : 85 66 3 15 93 88
Output : 15*/

import java.lang.*;
import java.util.*;

 class Number
 {
	  void Divisible(int arr[],int value)
	  {
		  
		  for(int icnt = 0;icnt < value;icnt++)
		  {
			  if(((arr[icnt] % 3) == 0) && ((arr[icnt] % 5 ) == 0))
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
	 


/*
5. Write Java program which accept N numbers from user and display
all such elements which are multiples of 11.

Input : N : 6
Elements : 85 66 3 55 93 88
Output : 66 55 88*/

import java.lang.*;
import java.util.*;

 class Number
 {
	  void Divisible(int arr[],int value)
	  {
		  
		  for(int icnt = 0;icnt < value;icnt++)
		  {
			  if((arr[icnt] % 11) == 0)
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
	 	 
