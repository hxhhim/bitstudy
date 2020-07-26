package edu.exam03.array08;

import java.util.Arrays;

public class SwapArray {
	public static void swapArr(int[] ar) {
		int temp =ar[0];
		ar[0]= ar[1];
		ar[1] = temp;
	}
	
/*	public static int[] swapArr(int[] arr) {
		
		int swap = 0;
		swap = arr[0];
		arr[1] =arr[0];  arr[0] =arr[1];
		arr[1] =swap;
		return arr;
				//바꾸는거 잘못함
	}*/
	public static void main(String[] args) {
		int[] arr = {10,20};
		System.out.println(Arrays.toString(arr));
		swapArr(arr);
		System.out.println(Arrays.toString(arr));
	}

}
