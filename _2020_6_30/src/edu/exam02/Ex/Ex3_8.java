package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요:");
		int a = sc.nextInt();
		if(a<0) {
			System.out.println("음의 정수값을 입력했습니다.");
		}else if(a%10==0) {
			System.out.println("이값은 10의 배수 입니다.");
		}else {
			System.out.println("이값은 10의 배수가 아닙니다.");
		}

	}

}
