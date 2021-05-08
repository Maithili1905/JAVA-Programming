/*1. Write Java program which accept number of rows and number of columns
from user and display below pattern.
Input : iRow = 4 iCol = 4

Output : A B C D
         A B C D
         A B C D
         A B C D */
		 

import java.lang.*;
import java.util.*;


  class Matrix
  {
	  void Display(int row , int col)
	  {
		  int i = 0 , j = 0;
		  int ch = 65;
		  
		  System.out.println();
		  for(i = 0; i < row; i++)
		  {
			  for(j = 0; j < col; j++)
			  { 			  
			     System.out.print((char) (ch+j)+ " ");
				 
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
		 
		 System.out.println("enter value for rows");
		 int row = sobj.nextInt();
		 
		 
		 System.out.println("enter value for columns");
		 int col = sobj.nextInt();
		 
		 Matrix mobj = new Matrix();
		 
		 mobj.Display(row,col);
	 }
 }

