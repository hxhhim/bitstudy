package edu.exam03.method02;
/*
 * 메서드(함수)
 * 기능을 일정역역으로 묶어서 사용하기 쉽도록 만든것
 * 일부의 값은 변경되지만
 * 논리가 동일한 코드가 반복될 때 메서드를 만든다.
 * 1) 코드 양이 줄어든다.
 * 2) 한눈에 파악이 된다.
 * 3) 메서드의 내용만 수정하면 사용하는 모든 곳에 적용된다.
 * 4) 자동차 부품처럼 일부가 문제가 생기면 해당 부품(메서드)만
 * 	   수정하거나 교체하면 된다(비용/시간이 절감된다.)
 * 
 * 	  리턴타입 메서드명(매개변수,...){
 * 	    return 리턴타입변수;
 *    }
 * 	  int func(int a, int b){
 * 	      int ret;
 * 	      ret = a+b;
 * 	      return ret;
 * 
 * }
 * 		void func(int a, int b){
 * 			...
 * 	        return;
 * 
 * }
 * 
 */
public class CalArith {
	
	public static  void add(int num0,int num1){
		int result;
		result = num0 + num1;
		System.out.printf("%d + %d의 합은 [%d]\n",  num0,num1,result);
	}
	public static void main(String[] args) {
		add(10,20);
		add(100,200);
		add(1000,2000);
		
		
		
/*		num0= 10;
		num1= 20;
		result = num0 + num1;
		System.out.printf("%d + %d의 합은 [%d]\n",  num0,num1,result);
		
		num0= 100;
		num1= 200;
		result = num0 + num1;
		System.out.printf("%d + %d의 합은 [%d]\n",  num0,num1,result);
		
		num0= 1000;
		num1= 2000;
		result = num0 + num1;
		System.out.printf("%d + %d의 합은 [%d]\n",  num0,num1,result);
*/			

	}

}
