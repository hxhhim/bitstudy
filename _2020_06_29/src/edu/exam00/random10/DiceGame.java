package edu.exam00.random10;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		int userNum = 0, comNum = 0;
		java.util.Random rd = new java.util.Random();
		Scanner sc = new Scanner(System.in);
		
		//1. ����� ���� �Է�
		System.out.print("1~6������ �����Է�:");
		userNum = sc.nextInt();
		//2. ��ǻ�� ���� ����
		comNum = rd.nextInt(6)+1;
		//3. ��Һ�
		String result = userNum > comNum ? "User Win":
			(userNum < comNum ? "Com Win" : "Draw");
		//4. ������
		String ret = (4 > 3) ? "4�� 3���� ũ��" : "�ƴϴ�";
		
		int i = (userNum < comNum) ? comNum : userNum;
		
		System.out.printf("userNum: %d, ComNum: %d\n", userNum, comNum);
		System.out.println(result);
		sc.close();
		
		
	}

}
