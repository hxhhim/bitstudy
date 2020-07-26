package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요:");
		int a = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요:");
		int b= sc.nextInt();
		System.out.println("세번째 정수를 입력하세요:");
		int c = sc.nextInt();
		
/*		if(a<b && a<c) {
			System.out.println("최소값은"+a+"입니다.");
		}else if(b<c && b<a) {
				System.out.println("최소값은"+b+"입니다.");
		}else if(c<a && c<b) {
			System.out.println("최소값은"+b+"입니다.");
		}
*/	
		int min =a;
		if(b<min)min=b;
		if(c<min)min=c;
		System.out.println("최소값은"+min+"입니다.");
		
	}

}
