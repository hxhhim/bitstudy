package ex_07_01;

import java.util.Scanner;

public class EX4_5_1 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int x;
		do {
			System.out.print("양의 정수값:");
			 x= stdln.nextInt();
		}while(x <=0);
		
		while(x>=0)
			System.out.println(x++);
		System.out.println("x의 값이" + x + "이 됐습니다.");

	}

}
