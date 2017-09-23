package org.jin.sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr =  {55, 2, 12,  100, 1, 392, 62, 23, 44, 78 };
		arr = bubbleSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static int [] bubbleSort(int [] arr){
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<(arr.length-1)-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
