package edu.exam03.localVariable10;

import java.util.Random;

/*
 *  메소드 중괄호{} 영역내에 변수를 선언하면
 *  이것을 "지역변수"라고 부른다.
 *  1)지역변수의 특징은 Stack메모리에 올라가며
 *    메섣의 호출이 끄탄면 Stack에서 사라지는 특징이 있다.
 *    메모리 절약하기 위해 필요할대 선언하고
 *    용도 끝나면 사라지도로고 설계된 변수
 *  2) 지역에서만 사용가능하다.
 *     즉 다른 메서드에 동일한 이름의 변수가 있어도 서로 다른 변수이다.
 *  3) 매개변수도 지역변수이다.
 *     만약 여러 개의 메서드에서 하나의 변수를 접근하고 싶다면 
 *     클래스 영역에 선언해야만 한다.
 *     클래스에 선언한 변수는 모든 메서드에서 접근가능하다.
 *    
 *  만약 클래스 내에서 모두 공유하고 싶은 변수가 이싿면 필드 선언해야 한다.
 *  필드는 클래스 멤버 변수를 의미한다.  
 *    
 */
		
public class LocalVariable {
	
	//클래스 멤버 변수, 필드(Field);
	public static Random rd = new Random();
	public static int num = 0; 
	public static void method0() {
//		int num = 0;//지역변수
		num = rd.nextInt(100);
		System.out.println("method0 : "+num);

	}
	
	public static void method1() {
//		int num = 0;//지역변수
		num = rd.nextInt(100);
		System.out.println("method1 : "+num);

	}
	public static void main(String[] args) {
//		int num = 0;//지역변수
		method0();
		System.out.println("num : "+ num);
		method1();
		System.out.println("num : "+ num);

	}

}
