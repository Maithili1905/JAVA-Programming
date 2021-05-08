/*2.Write a program which accept number from user and return the
count of odd digits.
Input : 2395
Output : 3
Input : 1018
Output : 2
Input : -1018
Output: 2 */

import java.lang.*;
import java.util.*;

 class Number
 {
	 int CountOdd(int ino)
	 {
		 int idigit = 0 , icnt = 0;
		 
		 while(ino != 0)
		 {
            idigit = ino % 10;
            if((idigit % 2) != 0)
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
		 
		 ret = nobj.CountOdd(value);
		 System.out.println("count of odd digit is : "+ret);
	 }
}
		 


