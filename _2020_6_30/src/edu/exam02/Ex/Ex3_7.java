package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요:");
		int a = sc.nextInt();
		if(a%5==0) {
			System.out.println("이값은 5로 나누어집니다.");
		}else {
			System.out.println("이값은 5로 나누어지지 않습니다.");
		}
			

	}

}
