package step01.exam05;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		int a,b;
		
		while(true) {
			System.out.println("a/b?");
			try {
				a = keyScan.nextInt();//에러검사할 부분을 try안에 넣는다.
				b = keyScan.nextInt();
				System.out.printf("결과는 %d입니다.\n",a/b);
			}catch(Exception e) {
				System.out.println("실행중 오류가 발생했습니다.\n다시 시도해주세요.!");
				keyScan.nextLine();
			}
		}

	}

}
/*
 * 예외처리문법
 * try{
 * 		예외가 발생할수 있는 코드
 *	}catch(예외종류에 따라 그 객체를 받을 파라미터 변수{
 *		예외를 처리하는 코드
 * }catch(예외의 종류에 따라 그 객체를 받을 파라미터 변수{
 * 		예외를 처리하는 코드
 * }finally{
 * 		예외가 발생하든 안하든 무조건 실행하는 코드 
 * }
 * 예외 처리 문법의 특징
 * 1)일반 코드와 예외 처리코드를 구분함으로써 코드를 읽기 쉽다.=>코드의 가독성을 높인다.
 * 2)예외를 구분해서 다룰수 있다.
 */
