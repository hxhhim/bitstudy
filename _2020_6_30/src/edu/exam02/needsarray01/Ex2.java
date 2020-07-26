package edu.exam02.needsarray01;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int[] num =new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10;i++) {
		System.out.println("숫자를 입력하세요:");
		int num1 =sc.nextInt();
		num[i]= num1;
		}
		
		for(int i=0; i<10 ; i++) {
			System.out.print(num[i]+",");
		}
		System.out.println();
		int sum=0;
		for(int i=0; i<10 ; i++) {
			sum += num[i];
		}
		System.out.println("총합은:"+sum+"입니다.");
	}

}
