package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int a = sc.nextInt();
		if(a>=80) {
			System.out.println("����� ������ �� �Դϴ�.");
		}else if(a>=70 && a<=79) {
			System.out.println("����� ������ �� �Դϴ�.");
		}else if(a>=60 && a<=69) {
			System.out.println("����� ������ �� �Դϴ�.");
		}else if(a>=50 && a<=59) {
			System.out.println("����� ������ �� �Դϴ�.");
		}else{
			System.out.println("����� ������ �� �Դϴ�.");
		}

	}

}
