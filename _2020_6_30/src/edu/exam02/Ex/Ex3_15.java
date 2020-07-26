package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요:");
		int a = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요:");
		int b= sc.nextInt();
		System.out.println("세번째 정수를 입력하세요:");
		int c = sc.nextInt();
		
/*		if(a<=b && b<=c) {
			System.out.println("중앙값은:"+b+"입니다");
		}else if(c<=b && b<=a) {
			System.out.println("중앙값은:"+b+"입니다");
		}else if(b<=a && a<=c) {
			System.out.println("중앙값은:"+a+"입니다");
		}else if(c<=a && a<=b) {
			System.out.println("중앙값은:"+a+"입니다");
		}else if(b<=c && c<=a) {
			System.out.println("중앙값은:"+c+"입니다");
		}else if(a<=c && c<=b) {
			System.out.println("중앙값은:"+c+"입니다");
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
		System.out.println("중앙값은"+med+"입니다.");
		}


	}


