/*
5. Write Java program which accept number of rows and number of columns
from user and display below pattern.
Input : iRow = 3 iCol = 4
Output : 1 2 3 4
         5 6 7 8
         9 10 11 12 */
		 

import java.lang.*;
import java.util.*;


  class Matrix
  {
	  void Display(int row , int col)
	  {
		  
		  int i = 0; int j = 0;
		  int m = 1;
		  
		  System.out.println();
		  
		  for(i = 0; i < row; i++)
		  {
			  for(j = 0; j < col; j++)
			  {
				  System.out.print(m+ " ");
				  m++;
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
