package edu.exam02.needsarray01;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int[] num =new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10;i++) {
		System.out.println("숫자를 입력하세요:");
		int num1 =sc.nextInt();
		num[i]= num1;
		}
		for(int i=0; i<10;i++) {
			if(num[i]%2==0) {
				System.out.print(num[i]+",");
			}else if(num[i]%3==0) {
				System.out.print(num[i]+",");
			}
			}
				
		}

	}


