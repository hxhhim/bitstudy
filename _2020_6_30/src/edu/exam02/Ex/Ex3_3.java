package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의정수 A를 입력해주세요:");
		int a = sc.nextInt();
		System.out.println("양의정수 B를 입력해주세요:");
		int b = sc.nextInt();
		if(a%b!=0) {
			System.out.println("B는 A의 약수가 아니다.");
		}else {
			System.out.println("B는 A의 약수이다");
		}
	}

}
