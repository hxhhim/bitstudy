package ex_07_01;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		int sum = 0;
		for(int i=1; i<a+1;i++) {
			sum += i;
			System.out.print(i+"+");
		}
		System.out.println();
		System.out.println("합은:"+sum+"입니다");
		sc.close();
	}
	

}
