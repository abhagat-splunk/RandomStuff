
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


/* Name of the class has to be "Main" only if the class is public. */
class JumpSearch
{
	public static int findTheNumber(int[] arr, int k, int step){
		int len = arr.length;
		int lastIndex = 0, firstIndex = 0;
		boolean flag = false;
		for(int i=0;i<len;i+=step){
			if(arr[i]>k){
				lastIndex = i;
				firstIndex = i-step;
			}
			if(arr[i]==k){
				return i+1;
			}
		}
		if(lastIndex==0 && firstIndex==0){
				return -1;
		}
		else{
			for(int i=firstIndex;i<lastIndex;i++){
				if(arr[i]==k){
					return i+1;
				}
			}
		}
		return -1;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			int temp;
			temp = sc.nextInt();
			arr[i] = temp;
		}
		int k = sc.nextInt();
		int step = (int)Math.floor(Math.sqrt(n));
		int result = findTheNumber(arr,k,step);
		System.out.println(result);
	}
}
