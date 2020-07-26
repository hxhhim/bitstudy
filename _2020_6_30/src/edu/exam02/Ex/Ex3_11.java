package edu.exam02.Ex;

import java.util.Random;

public class Ex3_11 {

	public static void main(String[] args) {
		Random rd = new Random();
		double num = rd.nextDouble();
		double num1 = rd.nextDouble();
		System.out.println("첫번재 실수는:"+num);
		System.out.println("두번재 실수는:"+num1);
		
/*		if(num>num1) {
			System.out.println(num+"이 더 큽니다.");
		}else {
			System.out.println(num1+"이 더 큽니다.");
		}*/
		
		double max;
		
		if(num>num1)
			max =num;
		else
			max =num1;
		System.out.println("큰 쪽의 값은"+max+"입니다.");
/*
 * 		double max = num>num1 ? num: num1;
 * 		System.out.println("큰 쪽의 값은"+max+"입니다.");
 * 		삼항연산자 사용		
 */
	}

}
