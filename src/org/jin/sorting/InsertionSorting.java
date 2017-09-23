package org.jin.sorting;

public class InsertionSorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr =  {55, 2, 12,  100, 1, 392, 62, 23, 44, 78 };
		arr = insertionSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static int [] insertionSort2(int [] arr) {
		int standard;
		int indicator;
		
		for(int i=1; i<arr.length; i++) {
			standard = arr[i];
			indicator = i-1;
			while(indicator>=0 && standard <arr[indicator] ){
				arr[indicator+1] = arr[indicator];
				indicator--;
			}
			arr[indicator+1] = standard;
		}
		return arr;
	}
	
	public static int [] insertionSort(int [] arr) {
		int standard;
		int position;
		for(int i=1; i<arr.length; i++) {
			standard = arr[i];
			position = i-1;
			while( position >= 0 && standard < arr[position] ) {
				arr[position+1] = arr[position];
				position--;
			}
			arr[position+1] = standard;
		}
		return arr; 
	}
}
