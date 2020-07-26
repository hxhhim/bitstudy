package edu.exam02.array08;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int [] scores = {98,12,99,9,25};
		System.out.println(Arrays.toString(scores));
		
		//Arrays.sort(scores);
		Arrays.parallelSort(scores);
		System.out.println(Arrays.toString(scores));
		
	}

}
