package edu.exam02.needsarray01;

import java.util.Random;
import java.util.Scanner;

public class KorArray1 {

	public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
		int[] kor = new int[700];
	
	
		int sum = 0;
		float ave = 0f;
		for(int i=0; i<kor.length;i++) {
			kor[i] = rd.nextInt(101);
		}

		
		for(int i=0; i<kor.length;i++)
			sum += kor[i];
		ave = (float)sum/kor.length;
		System.out.printf("ÃÑÇÕ: %d, Æò±Õ: %.2f\n", sum, ave);
	}

}
