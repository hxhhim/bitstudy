package edu.exam02.Ex;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ϼ���:");
		int a = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���:");
		int b= sc.nextInt();
		
		if( a == b)
			System.out.println("�� ���� �����ϴ�.");
		else {
			int min, max;
				if(a< b) {
					min =a;
					max =b;
				}else {
					min = b;
					max = a;
				}
				System.out.println("���� ���� "+ min +"�Դϴ�.");
				System.out.println("ū ����"+ max + "�Դϴ�");
		}
		
/*		if(a>b) {
			System.out.println("��������:"+b+" ū����:"+a+" �Դϴ�.");
		}else if(a==b) {
			System.out.println("�� ���� �����ϴ�.");
		}else {
			System.out.println("��������:"+a+" ū����:"+b+" �Դϴ�.");
		}
*/	}

}
