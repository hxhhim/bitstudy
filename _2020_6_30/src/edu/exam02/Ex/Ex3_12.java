package edu.exam02.Ex;

import java.util.Random;

public class Ex3_12 {

	public static void main(String[] args) {
		Random rd = new Random();
		int num = rd.nextInt();
		int num1 = rd.nextInt();
		System.out.println("첫번재 정수는:"+num);
		System.out.println("두번재 정수는:"+num1);
		System.out.println("두정수값의 차는:"+(num-num1));
//num이 클 경우만 작동
/*
 * 		int diff;
 * 		if(num>=num1)
 * 			diff = num-num1;
 * 		else
 * 		   diff = num1-num;
 * 		System.out.println("두값의 차는 "+diff +"입니다.");
 * 
 */// 삼항연산자사용
  		int diff = num>= num1?num-num1:num1-num;
  		System.out.println("두값의 차는 "+diff +"입니다.");
 
		
	}

}
