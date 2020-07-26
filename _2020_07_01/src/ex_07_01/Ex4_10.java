package ex_07_01;

import java.util.Scanner;

public class Ex4_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의정수값n을 입력하세요:");
		int n = sc.nextInt();
		int y = n;
		int x =1;
		for(int i=0; i<y ;i++) {
			x = x*n;
			n--;
		}
		System.out.println("곱한값은:"+x+"입니다.");
		sc.close();
	}

}
