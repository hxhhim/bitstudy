package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���:");
		int a = sc.nextInt();
		if(a<0) {
			System.out.println("���� �������� �Է��߽��ϴ�.");
		}else if(a%10==0) {
			System.out.println("�̰��� 10�� ��� �Դϴ�.");
		}else {
			System.out.println("�̰��� 10�� ����� �ƴմϴ�.");
		}

	}

}
