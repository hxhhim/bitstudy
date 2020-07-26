package edu.exam02.needsarray01;

public class KorArray {

	public static void main(String[] args) {
		int[] kor = {99,98,80};
		int[] eng = new int[5];
		int sum;
		float ave = 0f;
		
/*
		int[] kor1 = new int [3];
		kor1[0] = 99;
		kor1[1] = 98;
		kor1[2] = 80;
*/
		sum = kor[0] + kor[1] + kor[2];
		ave = (float)sum/3;
		System.out.printf("ÃÑÇÕ: %d, Æò±Õ:%.2f\n",sum,ave);

		
	}

}
