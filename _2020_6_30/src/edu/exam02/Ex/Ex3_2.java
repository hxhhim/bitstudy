package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = 0;
			System.out.println("정수값을 입력하세요:");
			a = sc.nextInt();
			if(a>0) {
				System.out.println("절대값은:"+a);
			}else {
			System.out.println("절대값은:"+(-a));
			}
	}

}
