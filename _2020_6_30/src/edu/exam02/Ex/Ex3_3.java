package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� A�� �Է����ּ���:");
		int a = sc.nextInt();
		System.out.println("�������� B�� �Է����ּ���:");
		int b = sc.nextInt();
		if(a%b!=0) {
			System.out.println("B�� A�� ����� �ƴϴ�.");
		}else {
			System.out.println("B�� A�� ����̴�");
		}
	}

}
