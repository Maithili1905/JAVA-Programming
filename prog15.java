/*
 3. Write java program which accept N numbers from user and accept
one another number as NO , return index of first occurrence of that NO.
Input : N : 6
NO: 66
Elements : 85 66 3 66 93 88
Output : 3
Input : N : 6
NO: 93
Elements : 85 66 3 66 93 88
Output : 4
Input : N : 6
NO: 12
Elements : 85 11 3 15 11 111
Output : -1*/

 import java.lang.*;
 import java.util.*;
 
 class Number
 {
	 int LastOcc(int arr[] ,int value, int ino)
	 {
		 int icnt = 0;
		 
		 for(icnt = value; icnt >= 0; icnt--)
		 {
			 if((icnt < value) && (arr[icnt] == ino))
			 {
				 break;
			 }
		 }
		 if((icnt < value) && (arr[icnt] == -1 ))
		 {
			 return -1;
		 }
		 else
		 {
			 return icnt;
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
		  
		  System.out.println("enter the number");
		  int ino = sobj.nextInt();
		  
		  int arr[] = new int[value];
		  System.out.println("enter the elemnts of array");
		  for(int i = 0; i < value; i++)
		  {
			  arr[i] = sobj.nextInt();
		  }
		  
		  Number nobj = new Number();
		  
		  int ret = nobj.LastOcc(arr,value,ino);
		  
		  System.out.println("number is : "  +ret);
		  
	  }
  }
	 
