package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A�ǰ��� ������ �Է����ּ���:");
		int a = sc.nextInt();
		System.out.println("B�ǰ��� ������ �Է����ּ���:");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("A�� ũ��");
		}else if(a<b) {
			System.out.println("B�� ũ��");
		}else{
			System.out.println("A�� B�� ����");
		}
		
	

	}

}
