package ex_07_01;

import java.util.Scanner;

/*
 * 양의 정수값을 읽어서 그 자리수를 출력
 * 나눠서 몫이 0이 될때가지 나누고 그횟수를 자리수로 출력
 */
public class Ex4_9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수값을 입력해주세요:");
		int x;
		do {
			System.out.print("양의 정수값:");
				x = sc.nextInt();
			}while(x<=0);
		
		int digit = 0;
		while(x > 0) {
			digit++;
				x/=10;
		}
		System.out.println("입력한 숫자는 " + digit + "자리입니다.");
		
	}

}
