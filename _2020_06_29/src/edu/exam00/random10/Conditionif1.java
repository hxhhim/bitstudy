package edu.exam00.random10;

import java.util.Scanner;

public class Conditionif1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�:");
		int num = sc.nextInt();
		
		if(num %2 == 0) 
			System.out.println("¦���Դϴ�.");
		else
				System.out.println("Ȧ���Դϴ�.");
			sc.close();
		}

}
