package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ϼ���:");
		int a = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���:");
		int b= sc.nextInt();
		System.out.println("����° ������ �Է��ϼ���:");
		int c = sc.nextInt();
		
/*		if(a<b && a<c) {
			System.out.println("�ּҰ���"+a+"�Դϴ�.");
		}else if(b<c && b<a) {
				System.out.println("�ּҰ���"+b+"�Դϴ�.");
		}else if(c<a && c<b) {
			System.out.println("�ּҰ���"+b+"�Դϴ�.");
		}
*/	
		int min =a;
		if(b<min)min=b;
		if(c<min)min=c;
		System.out.println("�ּҰ���"+min+"�Դϴ�.");
		
	}

}
