package edu.exam02.needsarray01;

public class Ex1 {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		for (int i=0;i<10;i++) {
			num[i] = (i*3)+3;
		}
		for(int i=9;i>=0;i--) {
			System.out.print(num[i]+",");
		}

	}

}
