package edu.exam00.transtype05;
//자동 형 변환
//1) 사이즈가 작은 것은 -> 사이크 큰것에 맞춰진다.
//2) 정수(표현범위 적은 것)-> 실수(표현범위 큰것)

public class AutoTransType {
	public static void main(String[] args) {
		//ch의 값이 i로 변환되어 대입된다.
		char ch = 'A';
		int i = ch;
		System.out.println(i);
		
		//b가 int로 자동 변환되어 연산된다.
		byte b = 100;
		int n = 100;
		System.out.println(b*n);
		
		//r이 double로 변환되어 연산된다.
		int r = 3;
		double pi = 3.14D;
		System.out.println(r*r*pi);
		
		byte x = 100;
		byte y = 100;
		System.out.println(x*y);
		System.out.println((byte)(x*y)); //오버 플로우 발생
		
	}
}
