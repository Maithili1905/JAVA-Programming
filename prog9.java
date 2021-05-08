/*1.Write a java program which accept number from user and return the
count of even digits.

Input : 2395
Output : 1
Input : 1018
Output : 2
Input : -1018
Output : 2
Input : 8462
Output : 4 */

import java.lang.*;
import java.util.*;

 class Number
 {
	 int CountEven(int ino)
	 {
		 int idigit = 0 , icnt = 0;
		 
		 while(ino != 0)
		 {
            idigit = ino % 10;
            if((idigit % 2) == 0)
			{
                 icnt++;
			}
            ino = ino / 10;
		 }
     return icnt;
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
		 
		 ret = nobj.CountEven(value);
		 System.out.println("count of even digit is : "+ret);
	 }
}
		 
