package ex_07_01;

import java.util.Scanner;

public class Ex04_19 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("정수값:");
		int n = stdln.nextInt();
		for(int i = 1; i<=n; i++)
			System.out.println(i +"의 제곱은 "+i*i+"입니다.");
			
		

	}

}
