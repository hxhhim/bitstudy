package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("입력한 정수는 양수입니다.");
		}else if(a<0) {
			System.out.println("입력한 정수는 음수입니다");
		}else {
			System.out.println("입력한 정수는 0입니다 .");
			
		}


	}

}
