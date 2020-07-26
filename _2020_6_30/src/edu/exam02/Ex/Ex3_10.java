package edu.exam02.Ex;

import java.util.Scanner;

public class Ex3_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		int a = sc.nextInt();
		if(a>=80) {
			System.out.println("당신의 성적은 수 입니다.");
		}else if(a>=70 && a<=79) {
			System.out.println("당신의 성적은 우 입니다.");
		}else if(a>=60 && a<=69) {
			System.out.println("당신의 성적은 미 입니다.");
		}else if(a>=50 && a<=59) {
			System.out.println("당신의 성적은 양 입니다.");
		}else{
			System.out.println("당신의 성적은 가 입니다.");
		}

	}

}
