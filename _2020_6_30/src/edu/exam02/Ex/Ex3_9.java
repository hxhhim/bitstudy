package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int a = sc.nextInt();
		if(a<0) {
			System.out.println("����� �ƴѰ��� �Է��߽��ϴ�.");
		}else if(a%3==0) {
			System.out.println("�� ���� 3���� ���������ϴ�.");
		}else if(a%3==1) {
			System.out.println("�� ���� 3���� ���� �������� 1�Դϴ�.");
		}else if(a%3==2) {
			System.out.println("�� ���� 3���� ���� �������� 2�Դϴ�.");
		}
	}

}
