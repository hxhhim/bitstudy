package edu.exam00.random10;

import java.util.Scanner;

public class Conditionif {

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
		String result ;
		if(userNum > comNum)
			result =  "User Win";
		else if	(userNum < comNum )
			result = "Com Win";
		else 
			result = "Draw";
		//4. ������
		
		System.out.printf("userNum: %d, ComNum: %d\n", userNum, comNum);
		System.out.println(result);
		sc.close();

	}

}
