package ex04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner sc = new Scanner(System.in);
		//레퍼런스 변수 선언은 클래스를 로딩 할 필요가 없다.
		//=> 실행하기전에 User.class
		User user;	//레퍼런스 변수를 선언할때 클래스가 로딩되지 않는다.
		
		//1) 스태틱 변수를 사용할때 클래스가 자동 로딩된다.
	//	User.count = 100; 

		//2) 스태틱 메서드를 호출할때 클래스가 자동 로딩된다.
	//	User.increaseCount();

		//3) 인스턴스를 생성할때 클래스가 자동 로딩된다.
	//	user = new User();
		
		//4) 클래스를 로딩시키는 전문 도구를 사용할때.
		Class c = Class.forName("ex04.User");
		user = (User)c.newInstance();
		user.name = "홍길동";
		System.out.println(user.name);
		
	}

}
