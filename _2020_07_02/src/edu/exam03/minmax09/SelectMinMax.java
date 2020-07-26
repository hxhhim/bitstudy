package edu.exam03.minmax09;

public class SelectMinMax {

	public static void viewMin(int[] ar) {
		int min = ar[0];
		for(int i=1;i<ar.length; i++) {
			if(ar[i]<min)
				min = ar[i];
		}
		System.out.println("가장 작은 값은"+ min);
		
		/*int min = arr[0];
		
		if(min>arr[1])
			min = arr[1];
		if
					
			min<arr[2]
*/ 
	}
	public static void viewMax(int[] ar) {
		int max = ar[0];
		for(int i=1;i<ar.length; i++) {
			if(ar[i]>max)
				max = ar[i];
		}
		System.out.println("가장 큰 값은"+ max);
		
		
		
	}
	public static void main(String[] args) {
		int[] arr = {99,23,55,21,10,9,86};
		viewMin(arr);
		viewMax(arr);

	}

}
