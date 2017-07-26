#include <iostream>
using namespace std;


int binarySearch(int arr[], int left, int right, int search){
	if(left<=right){
			int mid = (left+right)/2;
		if(arr[mid]==search){
			return mid+1;
		}
		else if(arr[mid]>search){
			return binarySearch(arr, left, mid-1, search);
		}
		else{
			return binarySearch(arr,mid+1,right,search);
		}
	}
	return -1;
}

int exponentialSearch(int arr[], int n, int search){
	if(arr[0]==search){
		return 1;
	}	
	for(int i=1;i<=n;i*=2){
		if(arr[i]==search){
			//cout<<"Expo"<<endl;
			return i+1;
		}
		else if(arr[i]>n){
			return binarySearch(arr,i/2,i,search);
		}
	}
}




int main() {
	// your code goes here
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	int search;
	cin>>search;
	int result = exponentialSearch(arr,n,search);
	cout<<result;
	return 0;
}
