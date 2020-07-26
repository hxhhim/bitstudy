package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번재 정수를 입력해주세요:");
		int a = sc.nextInt();
		System.out.println("두번재 정수를 입력해주세요:");
		int b = sc.nextInt();
		
		
		int diff = a>=b?a-b:b-a;
		if(diff<=10) {
			System.out.println("두 값의 차는 10이하입니다.");
		}else {
			System.out.println("두 값의 차는 11이상입니다.");
		}
		
		
		
		if((a-b)<=10) {
			System.out.println("두 값의 차는 10이하입니다.");
		}else {
			System.out.println("두 값의 차는 11이상입니다.");
		}
	}

}
