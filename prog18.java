/*
 5. Write java program which accept N numbers from user and return
product of all odd elements.
Input : N : 6
Elements : 15 66 3 70 10 88
Output : 45

Input : N : 6
Elements : 44 66 72 70 10 88
Output : 0
 */


import java.lang.*;
import java.util.*;

  class Number
  {
	  int Product(int arr[])
	  {
	  int icnt = 0;
	  int mult = 1;
	  
	  for(icnt = 0 ; icnt < arr.length ; icnt++)
	  {
		  if((arr[icnt] % 2) == 0)
		  {
			  return -1;
		  }
		  else if((arr[icnt] % 2) != 0)
		  {
            mult = mult * arr[icnt];
		  }
	  }
	  return mult;
	  }
  }	  

 class demo
 {
     public static void main(String arg[])
	 { 
         Scanner sobj = new Scanner(System.in);
         System.out.println("enetr the value");
        int value = sobj.nextInt();
		
		int arr[] = new int[value];
	    
		System.out.println("elements of array are");
		for(int i = 0;i < arr.length; i++)
		{
			arr[i] = sobj.nextInt();
		}
		
		Number nobj = new Number();
		
		 int ret = nobj.Product(arr);
		 System.out.println("product of odd numbers is : " +ret);
	 }
 }
         		  
		 
		     
		 
		 
		     
