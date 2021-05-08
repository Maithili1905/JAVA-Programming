/*
2. Write Java program which accept number of rows and number of
columns from user and display below pattern.
Input : iRow = 4 iCol = 3
Output : 1 2 3
         1 2 3
         1 2 3
         1 2 3
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
		 



