package edu.exam02.Ex;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요:");
		int a = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요:");
		int b= sc.nextInt();
		
		if( a == b)
			System.out.println("두 값이 같습니다.");
		else {
			int min, max;
				if(a< b) {
					min =a;
					max =b;
				}else {
					min = b;
					max = a;
				}
				System.out.println("작은 값은 "+ min +"입니다.");
				System.out.println("큰 값은"+ max + "입니다");
		}
		
/*		if(a>b) {
			System.out.println("작은값은:"+b+" 큰값은:"+a+" 입니다.");
		}else if(a==b) {
			System.out.println("두 값이 같습니다.");
		}else {
			System.out.println("작은값은:"+a+" 큰값은:"+b+" 입니다.");
		}
*/	}

}
