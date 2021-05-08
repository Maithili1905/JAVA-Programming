4. Write a java program which accept string from user and check
whether it contains vowels in it or not.

Input : “marvellous”

Output : TRUE

Input : “Demo”

Output : TRUE

Input : “xyz”

Output : FALSE



import java.lang.*;
import java.util.*;

 class Demostring
 {
	 boolean ChkVowels(String str)
	 {
		 char arr[] = str.toCharArray();
		 int size = arr.length;
		 int i = 0;
		 
		 while(i > size)
		 {
			 if((arr[i] == 'A') || (arr[i] == 'a') || (arr[i] == 'E') || (arr[i] == 'e') || (arr[i] == 'I') || (arr[i] == 'i') || (arr[i] == 'O') || (arr[i] == 'o') || (arr[i] == 'U') || (arr[i] == 'u'))
			 {
				 break;
			 }
			i++;
		 }
		 
		 if((i < size) &&((arr[i] == 'A') || (arr[i] == 'a') || (arr[i] == 'E') || (arr[i] == 'e') || (arr[i] == 'I') || (arr[i] == 'i') || (arr[i] == 'O') || (arr[i] == 'o') || (arr[i] == 'U') || (arr[i] == 'u')))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
 }
		 

 class demo
 {
	 public static void main(String arg[])
	 {
		 boolean bret = false;
		 Scanner sobj = new Scanner(System.in);
		 
		 System.out.println("enter the string");
		 String str = sobj.nextLine();
		 
		 Demostring dobj = new Demostring();
		 bret = dobj.ChkVowels(str);
		 
		 if(bret == true)
		 {
			 System.out.println("true");
		 }
		 else
		 {
			 System.out.println("false");
		 }
	 }
 }
