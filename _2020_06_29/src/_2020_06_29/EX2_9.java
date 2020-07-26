package _2020_06_29;

import java.util.Scanner;

public class EX2_9 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변을 입력하세요:");
		num1 = sc.nextInt();
		System.out.println("삼각형의 높이를 입력하세요:");
		num2 = sc.nextInt();
		System.out.println("삼각형의 넓이는:" + (num1*num2)/2 + "입니다");
	}

}
