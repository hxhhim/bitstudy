package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A의값을 정수로 입력해주세요:");
		int a = sc.nextInt();
		System.out.println("B의값을 정수로 입력해주세요:");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("A가 크다");
		}else if(a<b) {
			System.out.println("B가 크다");
		}else{
			System.out.println("A와 B가 같다");
		}
		
	

	}

}
