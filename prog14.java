/*
1. Write java program which accept N numbers from user and accept
one another number as NO , check whether NO is present or not.
Input : N : 6
NO: 66
Elements : 85 66 3 66 93 88
Output : TRUE

Input : N : 6
NO: 12
Elements : 85 11 3 15 11 111
output: FALSE*/

import java.lang.*;
import java.util.*;


 class Number
 {
	 boolean ChkElement(int arr[], int ino)
	 {
		 int icnt = 0;
		 int size = arr.length;
		 for( icnt = 0; icnt < arr.length;icnt++)
		 {
			 if(( icnt < size) && (arr[icnt]) == ino)
			 {
				 break;
			 }
		 }
		 if((icnt < size) && (arr[icnt]) == ino)
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
	 public static void main(String arg[])
	 {
		 boolean bret = false;
		 Scanner sobj = new Scanner(System.in);
		 
		 System.out.println("enter the value");
		 int value = sobj.nextInt();
		 
		 System.out.println("enter the number");
		 int ino = sobj.nextInt();
		 
		 System.out.println("enter the elements of array");
		 int arr[] = new int[value];
		 
		 for(int i = 0;i < arr.length;i++)
		 {
			 arr[i] = sobj.nextInt();
		 }
		 
		 Number nobj = new Number();
		   
		 bret = nobj.ChkElement(arr,ino);
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
		 
