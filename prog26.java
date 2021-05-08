/*3. Write Java program which accept number of rows and number of columns
from user and display below pattern.
Input : iRow = 3 iCol = 5
Output : A A A A A
         B B B B B
         C C C C C */
		 

import java.lang.*;
import java.util.*;


  class Matrix
  {
	  void Display(int row , int col)
	  {
		  
		  int i = 0; int j = 0;
		  int ch = 65;
		  
		  for(i = 0; i < row; i++)
		  {
			  for(j = 0; j < col; j++)
			  {
				  System.out.print((char) (ch+i)+ " ");
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
		 
