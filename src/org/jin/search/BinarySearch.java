package org.jin.search;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =  {55, 2, 12,  100, 1, 392, 62, 23, 44, 78 };
		int target = 392;
		
		Arrays.sort(arr);
		if(isExist(arr, target)) {
			System.out.println("found");
		} else {
			System.out.println("Not in the array");
		}
	}
	
	static private boolean isExist(int [] arr, int target) {
		int min=0;
		int mid;
		int max=arr.length;
		
		mid = (min + max)/2;
		
		while(min <=max) {
			if(arr[mid] == target) {
				System.out.println("The value is at " + mid + " of arrays");
				return true;
			} else {
				if(arr[mid]<target) {
					min = mid;
				} else {
					max=mid;
				}
			}
			mid = (min+max)/2;
		}
		
		return false;
	}

}
