/*4.Write a program which accept number from user and return
multiplication of all digits.

Input : 2395
Output : 270

Input : 1018
Output : 8

Input : 9440
Output : 144

Input : 922432
Output : 864

*/

import java.lang.*;
import java.util.*;

 class Number
 {
	 int Multiplication(int ino)
	 {
		 int idigit = 0 , mult = 1;
		 
		 if(ino < 0)
		 {
			 ino = -ino;
		 }
		 
		 while(ino != 0)
		 {
            idigit = ino % 10;
            if(idigit != 0)
			{
                 mult = mult * idigit;
			}
            ino = ino / 10;
		 }
     return mult;
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
		 
		 ret = nobj.Multiplication(value);
		 System.out.println("multiplication is : "+ret);
	 }
}
		 
