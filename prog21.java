3. Write a java program which accept string from user and return
difference between frequency of small characters and frequency
of capital characters.


Input : “MarvellouS”

Output : 6 (8-2)




import java.lang.*;
import java.util.*;
 
 class Demostring
 {
	 int CountCaptials(String str)
	 {
		char arr[] = str.toCharArray();
		int size = arr.length;
		 int i = 0, icnt = 0, icnt1 = 0;
		 
		 while(i < size)
		 {
			 
			if((arr[i] >= 'a') && (arr[i] <= 'z')) 
			{
				icnt++;
			}
			else if((arr[i] >= 'A') && (arr[i] <= 'Z')) 
			{
				icnt1++;
			}
			i++;
		 }
		 return icnt1 - icnt;
	 }
 }

 class demo
 {
	 public static void main(String arg[])
	 {
		 Scanner sobj = new Scanner(System.in);
		 
		 System.out.println("enter the string");
		 String str = sobj.nextLine();
		 
		 Demostring dobj = new Demostring();
		 
		 int ret = dobj.CountCaptials(str);
		 
		 System.out.println("count is :" +ret);
	 }
 }

