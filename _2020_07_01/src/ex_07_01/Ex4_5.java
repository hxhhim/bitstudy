package ex_07_01;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int a = sc.nextInt();
		
			while(0>a) {
				System.out.println("양수를 입력하세요");
				a = sc.nextInt();
			}
			int b = a;
				for(int j=0; j<b+1; j++) {
					System.out.println(a);
					++a;
				}
					
		System.out.println("입력값은:"+b+"입니다");	
		sc.close();
	}
}

