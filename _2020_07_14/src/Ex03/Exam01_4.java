package Ex03;

import java.util.ArrayList;
import java.util.Date;

public class Exam01_4 {

	public static void main(String[] args) {
		
		
		
		/*
		ArrayList names = new ArrayList();
		names.add("홍길동");
		names.add(new Date());
		names.add(new Integer(20));
		names.add(true);
		
		
		//문제점: 특정 타입의 객체(의주소)만 저장하고 싶은데 그것을 막을 방법이 없다.
		//해결책:어떤 타입의 객체를 저장할 지 지정하자!
		System.out.println("---------------");
		for(int x=0; x<names.size();x++) {
			System.out.println(names.get(x));
		}*/
		
		//2)제너릭 사용 해보자
		//=> ArrayList에 담을 데이터의 타입을 제한한다.
		//=> ArrayList<String> names2 = new ArrayList<String>();
		//ArrayList<String> names2 = new ArrayList<String>();
		ArrayList<String> names2 = new ArrayList<>();//new 명령다음에 타입지정을 생략할 수 있다.
		names2.add("홍길동"); 	//상수 스트링 객체의 주소를 저장
		names2.add(new String("임꺽정")); //그냥 일반 스트링 객체의 주소를 저장
//		names2.add(new Integer(2)); 컴파일오류! 지정된 타입이 아니면 저장불가
//		names2.add(new Date());
		
		//제네릭 사용 이점;
		//=> 지정된 타입외에 다른 타입의 객체를 저장 할 수 없다.
		//=> 그것도 실행 전 컴파일 단계에서 검사 한다. =>오류를 쉽게 잡을수 있다.
		//=>개발자의 의도에 반하여 동작하는 것을 최소화 할수 있다.=> 프로그램 안정성이 좋아진다.
	}
}
