/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class InterpolationSearch
{
	public static int findUsingInterpolation(int[] arr, int search){
		 int n = arr.length;
		 int low = 0;
		 int high = n-1;
		 while(low<=high && arr[low]<arr[high] && search<=arr[high] && search>=arr[low]){
		 	int mid = low + (int)((double)((high-low)*(search-arr[low]))/(arr[high]-arr[low]));
		 	if(arr[mid]==search){
		 		return mid+1;
		 	}
		 	else{
		 		if(arr[mid]>search){
		 			high = mid-1;
		 		}
		 		else{
		 			low = mid+1;
		 		}
		 	}
		 }
		 if(arr[low]==arr[high] && search == arr[low]){
		 	return 1;
		 }
		 return -1;

	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int search = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			int temp = sc.nextInt();
			arr[i] = temp;
		}
		System.out.println(findUsingInterpolation(arr,search));
	}
}
