package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù���� ������ �Է����ּ���:");
		int a = sc.nextInt();
		System.out.println("�ι��� ������ �Է����ּ���:");
		int b = sc.nextInt();
		
		
		int diff = a>=b?a-b:b-a;
		if(diff<=10) {
			System.out.println("�� ���� ���� 10�����Դϴ�.");
		}else {
			System.out.println("�� ���� ���� 11�̻��Դϴ�.");
		}
		
		
		
		if((a-b)<=10) {
			System.out.println("�� ���� ���� 10�����Դϴ�.");
		}else {
			System.out.println("�� ���� ���� 11�̻��Դϴ�.");
		}
	}

}
