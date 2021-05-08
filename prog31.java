/*
3. Write Java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 3 iCol = 5
Output : 5 4 3 2 1
         5 4 3 2 1
         5 4 3 2 1
 */
		 

import java.lang.*;
import java.util.*;


  class Matrix
  {
	  void Display(int row , int col)
	  {
		  
		  int i = 0; int j = 0;
		  int m = 1;
		  
		  System.out.println();
		  
		  for(i = row; i >= 1; i--)
		  {
			  for(j = col; j >= 1; j--)
			  {
				  System.out.print(j+ " ");
				  
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
		 

