package edu.exam02.needsarray01;

import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		int[] num = new int[10];
		Random rd = new Random();
		
		for(int i=0; i<10; i++) {
			num[i]= rd.nextInt(10)+1;
		}
		for(int i=0; i<10 ; i++) {
			System.out.print(num[i]+",");
		}
		System.out.println();
		for(int i=0; i<10; i++) {
			if(num[i]%2!=0) {
				System.out.println(num[i]);
			}
		}
	}

}
