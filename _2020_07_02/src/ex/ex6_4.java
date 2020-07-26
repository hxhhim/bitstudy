package ex;

import java.util.Arrays;
import java.util.Random;

public class ex6_4 {

	public static void main(String[] args) {
		int[] arr = new int[12];
		Random rd = new Random();
		for(int i=0; i<arr.length;i++ ) {
			arr[i]=rd.nextInt(10)+1;
		}
		System.out.print(Arrays.toString(arr));
		System.out.println();
		
		for(int j=10 ;j>-1;j--) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<=j)
					System.out.print(" ");
				else
					System.out.print("*");
		}System.out.println();
	}
 }
}