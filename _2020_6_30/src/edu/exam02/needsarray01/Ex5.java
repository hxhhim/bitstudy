package edu.exam02.needsarray01;

public class Ex5 {

	public static void main(String[] args) {
		int [] num = new int[10];
		int sum = 1;
		for (int i=0;i<10;i++) {
			num[i] = i+1;
		}
		for (int i=0;i<10;i++) {
			sum = sum*num[i];
		}
		System.out.println("1~10까지 곱한값은:"+sum);
	}

}
