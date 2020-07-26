package ex;

import java.util.Arrays;

public class ex6_2 {

	public static void main(String[] args) {
//		int[] arr = new int[5];
		
//		for(int i=0,j=5; i<arr.length ;i++) {
//			arr[i]=j--;
//		}
//		System.out.println(Arrays.toString(arr));
		
		int[] a = new int[5];
		
		for(int i =0; i<a.length;i++)
			a[i] = 5-i;
		for(int i =0;i<a.length; i++)
			System.out.printf("a[%d]= %d%n",i,a[i]);
		
		
		
		
/*		arr[0]=5;
		arr[1]=4;
		arr[2]=3;
		arr[3]=2;
		arr[4]=1;
*/		
				

	}

}
