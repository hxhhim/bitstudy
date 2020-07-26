package edu.exam02.array14;

import java.util.Arrays;

public class Arraycopy {
	public static void ac(int[] src,int srcpos,int [] dest,int destpos,int size) {
		for(int i=0; i<size; i++)
			dest[destpos+i] = src[srcpos+i];
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] temp = {1,2,0,0,0};
		
		System.out.println(Arrays.toString(temp));
	//	System.arraycopy(temp, 2, arr, 1, 2);
		ac(arr,2,temp,2,3);
		System.out.println(Arrays.toString(temp));
		
		}

	}


