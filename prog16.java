/*
 3. Write java program which accept N numbers from user and accept
one another number as NO , return index of first occurrence of that NO.*/

import java.lang.*;
import java.util.*;


class Number
{
	int Index(int val, int no, int arr[])
	{
		int cnt = 0 , pos = 0;
		int size = arr.length;
		
		for(cnt = val - 1; cnt >= 0; cnt--)
		{
			if((cnt > size) && (arr[cnt] == no))
			{
				pos = cnt;
				break;
			}
		}
		
		if((cnt > size) && (arr[cnt] == no))
		{
			return cnt;
		}
		else 
		{
			return -1;
		}
	}
}
		
		


class demo
{
	public static void main(String Arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("enter the value\n");
		int val = sobj.nextInt();
		
		System.out.println("enter the element to be searched\n");
		int no = sobj.nextInt();
		
		int arr[] = new int[val];
		
		System.out.println("array elements\n");
		
		for(int i = 0; i < val; i++)
		{
			arr[i] = sobj.nextInt();
		}
		
		Number nobj = new Number();
		
		int ret = nobj.Index(val,no,arr);
		
		System.out.println("last occ is:"+ret);
		
	}
}
