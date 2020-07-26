package edu.exam00.random10;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		int userNum = 0, comNum = 0;
		java.util.Random rd = new java.util.Random();
		Scanner sc = new Scanner(System.in);
		
		//1. 사용자 숫자 입력
		System.out.print("1~6사이의 숫자입력:");
		userNum = sc.nextInt();
		//2. 컴퓨터 난수 생성
		comNum = rd.nextInt(6)+1;
		//3. 대소비교
		String result = userNum > comNum ? "User Win":
			(userNum < comNum ? "Com Win" : "Draw");
		//4. 결과출력
		String ret = (4 > 3) ? "4가 3보다 크다" : "아니다";
		
		int i = (userNum < comNum) ? comNum : userNum;
		
		System.out.printf("userNum: %d, ComNum: %d\n", userNum, comNum);
		System.out.println(result);
		sc.close();
		
		
	}

}
