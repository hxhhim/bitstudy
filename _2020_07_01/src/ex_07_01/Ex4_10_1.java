package ex_07_01;

import java.util.Scanner;

public class Ex4_10_1 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("양의 정수값:");
				n = stdln.nextInt();
		}while(n <= 0);
		
		int factorial = 1;
		int i = 1;
		
		while(i <= n) {
			factorial = factorial*i;
			i++;
		}
		System.out.println("1부터 "+ n + "까지의 곱은" + factorial + "입니다.");
		
		}

}
