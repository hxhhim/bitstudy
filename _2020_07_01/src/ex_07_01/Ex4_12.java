package ex_07_01;

import java.util.Scanner;

public class Ex4_12 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int x;
		do {
			System.out.println("양의 정수값:");
				x = stdln.nextInt();
		}while(x<=0);
		
		for(; x>=0; x--)
			System.out.println(x);

	}

}
