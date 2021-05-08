/*3.Write a program which accept number from user and return the
count of digits in between 3 and 7.

Input : 2395
Output : 1

Input : 1018
Output : 0

Input : 4521
Output : 2

Input : 9922
Output : 0 */

import java.lang.*;
import java.util.*;

 class Number
 {
	 int CountRange(int ino)
	 {
		 int idigit = 0 , icnt = 0;
		 
		 if(ino < 0)
		 {
			 ino = -ino;
		 }
		 
		 while(ino != 0)
		 {
            idigit = ino % 10;
            if((idigit >= 3) && (idigit <= 7))
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
		 
		 ret = nobj.CountRange(value);
		 System.out.println("count of range  is : "+ret);
	 }
}
		 
