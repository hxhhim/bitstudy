package edu.exam02.Ex;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex3_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번재 정수를 입력하세요");
		int a = sc.nextInt();
		System.out.println("두번재 정수를 입력하세요");
		int b = sc.nextInt();
		System.out.println("세번재 정수를 입력하세요");
		int c = sc.nextInt();

		if(a>b) {
			int t =a; a =b; b=t;
		}
		if(b>c) {
			int t = b; b=c; c =t;
		}
		if(a>b) {
			int t =a; a =b;b=t;
		}
		System.out.println("변수 a는"+ a +"입니다.");
		System.out.println("변수 b는"+ b +"입니다.");
		System.out.println("변수 c는"+ c +"입니다.");
/*		Integer [] arr = {a,b,c};
		Arrays.sort(arr);
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
	}
}


