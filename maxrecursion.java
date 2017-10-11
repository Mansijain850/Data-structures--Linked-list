''' Finding maximum element in a linked list using recursion'''

import java.lang.*;
import java.io.*;
import java.util.*;

class findmax
{
	static int findel(int a[], int n)
	{
		if(n==1)
			return a[0];
		return Math.max(a[n-1], findel(a,n-1));

		

	}
	public static void main(String[] args) {
		int a[] = {2,4,6,45,78,11,99};
		int n = a.length;
		findmax obj =  new findmax();
		System.out.println(obj.findel(a,n));
		
	}
}
