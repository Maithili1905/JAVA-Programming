/*
4. Write Java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 3 iCol = 4
Output : * # * #
         * # * #
         * # * #
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
		  
		  for(i = 1; i <= row; i++)
		  {
			  for(j = 1; j <= col; j++)
			  {
				  if((j % 2) == 0)
				  {
					  System.out.print("#\t");
				  }
				  else
				  {
					 System.out.print("*\t");
				  }					 
				  
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
		 

