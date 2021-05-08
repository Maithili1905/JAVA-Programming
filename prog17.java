/*
 4. Write java program which accept N numbers from user and accept
Range, Display all elements from that range
Input : N : 6
Start: 60
End : 90
Elements : 85 66 3 76 93 88
Output : 66 76 88

Input : N : 6
Start: 30
End : 50
Elements : 85 66 3 76 93 88
output: */


import java.lang.*;
import java.util.*;

  class Number
  {
	  void Range(int arr[],int value, int start,int end)
	  {
	  int icnt = 0;
	  
	  for(icnt = 0 ; icnt < arr.length ; icnt++)
	  {
		  if((arr[icnt] >= start) && (arr[icnt] <= end))
		  {
            System.out.println("numbers are : " +arr[icnt]);
		  }
	  }
	  }
  }	  

 class demo
 {
     public static void main(String arg[])
	 { 
         Scanner sobj = new Scanner(System.in);
         System.out.println("enetr the value");
        int value = sobj.nextInt();
		
		System.out.println("enter the starting number");
		int start = sobj.nextInt();
		
		System.out.println("enter the ending number");
		int end = sobj.nextInt();
		
		int arr[] = new int[value];
	    
		System.out.println("elements of array are");
		for(int i = 0;i < arr.length; i++)
		{
			arr[i] = sobj.nextInt();
		}
		
		Number nobj = new Number();
		
		nobj.Range(arr,value,start,end);
	 }
 }
         	
