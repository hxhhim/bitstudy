package edu.exam03.binarysearch;

import java.util.Arrays;

public class bubblesort {

	public static void swap(int[] arr,int idx0, int idx1) {
		int temp = arr[idx0];
		arr[idx0] = arr[idx1];
		arr[idx1] = temp;
	}
	public static void bubbleSort(int[] arr,int o) {
		int len = arr.length-1;
		for(int i= 0; i<arr.length-1; i++) {
			for(int j=0; j<len;j++) {
				if(o*arr[j]>o*arr[j+1])
				    swap(arr,j,j+1);
				}
			len--;
		}
	}
	public static void main(String[] args) {
		int[] arr = {99,10,22,53,29,55,12};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr,1);//양수 음수로 오름차순, 내림차순의 차이이지 다른값이 들어가도 상관없다.
		System.out.println(Arrays.toString(arr));
	}

}
