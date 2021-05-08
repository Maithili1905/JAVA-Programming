/*
5.Write a program which accept number from user and return
difference between summation of even digits and summation of odd
digits.

Input : 2395
Output : -15 (2 - 17)

Input : 1018
Output : 6 (8 - 2)

Input : 8440
Output : 16 (16 - 0)

Input : 5733
Output : -18 (0 - 18)

*/

import java.lang.*;
import java.util.*;

 class Number
 {
	 int CountDiff(int ino)
	 {
		 int idigit = 0 , even = 0 , odd = 0;
		 
		 if(ino < 0)
		 {
			 ino = -ino;
		 }
		 
		 while(ino != 0)
		 {
            idigit = ino % 10;
            if((idigit % 2 ) == 0)
			{
                 even = even + idigit;
			}
			else
			{
				odd = odd + idigit;
			}
            ino = ino / 10;
		 }
     return even - odd;
	 }
 }	 

class demo
{
	 public static void main(String arg[])
	 {
		 int value = 0 , ret = 0;
		 
		 Scanner sobj = new Scanner(System.in);
		 
		 System.out.println("enter the number");
		 value = sobj.nextInt();
		 
		 Number nobj = new Number();
		 
		 ret = nobj.CountDiff(value);
		 System.out.println("Difference is : "+ret);
	 }
}
		 

