package edu.exam03.method01;

import java.util.Scanner;

public class MethodDef {
		static int age =0;
//	public static int getAge() {
		public static void getAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("좋은 아침입니다.");
		System.out.print("나이는 어떻게되세요?");
//		int age = 0;
	
		age = sc.nextInt();
		//return age;
	}
//	public static void greeting(int age) {
		public static void greeting() {
			if(age >40)
				System.out.println("안녕하세요 꾸벅~");
			else if(age>30)
				System.out.println("반가 반가");
			else if(age>20)
				System.out.println("어이~ 잘지내");
			else if(age>10)
				System.out.println("야~ 저리가");
				
	}
	public static void main(String[] args) {
	//	int age;
	//	age = getAge();
		getAge();
	//	greeting(age);
		greeting();	
	}

}
