package step01.exam05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);	
		int a,b;
		while(true) {
			System.out.println("a/b?");
			a= keyScan.nextInt();
			b= keyScan.nextInt();
			System.out.printf("결과는 %d입니다.",a/b);
			//0으로 나누게되면 예외가 발생한다.
			//=>예외가 발생하면 실행을 멈추고 이 메소드를 호출 한 쪽에  즉시 보고한다.
			//=>main()를 호출한 것은 JVM이다.
			//=>JVM은 예외를 보고 받으면 즉시 실행을 멈춘다.
			//바로 이것이 문제!
					
		}

	}

}
/*예외처리
 * =>실행 중 오류가 발생하더라도 시스템을 멈추지 않고 계속 실행시킬수 있게 만드는 문법
 * 
 * 예외종류
 * 1)시스템오류
 * =>java.lang.Error 클래스계의 예외이다.
 * =>JVM이 발생시킨다.
 * =>개발자가 제어할수 없다.
 * =>이런오류가 발생하면 적절히 처리한 후에 시스템을 종료해야한다.
 * =>예)메모리가 부족하다는 오류발생!
 * 	사용자에게 안내메시지를 출력한 후 시스템을 종료한다.
 * =>예외처리를 필수로 요구하지 않는다.
 * 	즉 개발자가 예외를 처리하기위해 try ~catch ~를  반드시 하용할 필요는 없다.
 * 
 * 2)애플리케이션 예외
 * =>java.lang.Exception 클래스 계열의 예외이다.
 * =>애플리케이션에서 발생시킨다.
 * =>개발자가 제어할수 있다.
 * =>이런예외가 발생하면 적절히 처리한후 계속 시스템 을 실행 시킬수 있다.
 * =>예)숫자가 아닌 문자가 입력되었다.
 * 사용자에게 다시 입력하라고 안내 메세지를 출력한후  실행을 계속한다.
 * =>예외처리코드를 반드시 장성해야 한다.
 * 	즉 try ~catch코드를 장성해야 한다.
 * 
 * 
 * 예외클래스 상속관계
 * java.lang.Throwable
 * =>java.lang.error
 * =>java.lang.Exception
 *
 * 런타임 예외(java.lang.RuntimeExcepion)
 * =>java.lang.exciption 계열의 예외(애플리케이션 예외)임에도 불구하고
 * 		예외처리 코드를 반드시 잘성할 필요는 없다.
 * =>실행시에 발생되는 가벼운 예외로서,
 * 		중앙에서 처리할 목적으로 보통 사용된다.
 * 
 * 
 * 
 * 
 * 
 * 
 */
