package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ϼ���:");
		int a = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���:");
		int b= sc.nextInt();
		System.out.println("����° ������ �Է��ϼ���:");
		int c = sc.nextInt();
		
/*		if(a<=b && b<=c) {
			System.out.println("�߾Ӱ���:"+b+"�Դϴ�");
		}else if(c<=b && b<=a) {
			System.out.println("�߾Ӱ���:"+b+"�Դϴ�");
		}else if(b<=a && a<=c) {
			System.out.println("�߾Ӱ���:"+a+"�Դϴ�");
		}else if(c<=a && a<=b) {
			System.out.println("�߾Ӱ���:"+a+"�Դϴ�");
		}else if(b<=c && c<=a) {
			System.out.println("�߾Ӱ���:"+c+"�Դϴ�");
		}else if(a<=c && c<=b) {
			System.out.println("�߾Ӱ���:"+c+"�Դϴ�");
		}	*/
		
		int med = a;
		if(a>=b) 
			if(b>=c) 
				 med = b;
			  else if(a<=c) 
				med =a;
			  else 
				med =c;
		else if(a>c) 
			med =a;
		else if(b>c)
			med =c;
		else  
			med = b;
		System.out.println("�߾Ӱ���"+med+"�Դϴ�.");
		}


	}


