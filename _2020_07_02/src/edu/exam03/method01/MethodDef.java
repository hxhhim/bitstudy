package edu.exam03.method01;

import java.util.Scanner;

public class MethodDef {
		static int age =0;
//	public static int getAge() {
		public static void getAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��ħ�Դϴ�.");
		System.out.print("���̴� ��ԵǼ���?");
//		int age = 0;
	
		age = sc.nextInt();
		//return age;
	}
//	public static void greeting(int age) {
		public static void greeting() {
			if(age >40)
				System.out.println("�ȳ��ϼ��� �ٹ�~");
			else if(age>30)
				System.out.println("�ݰ� �ݰ�");
			else if(age>20)
				System.out.println("����~ ������");
			else if(age>10)
				System.out.println("��~ ������");
				
	}
	public static void main(String[] args) {
	//	int age;
	//	age = getAge();
		getAge();
	//	greeting(age);
		greeting();	
	}

}
