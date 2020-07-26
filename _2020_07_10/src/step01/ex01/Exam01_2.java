package step01.ex01;

public class Exam01_2 {

	public static void main(String[] args) {
		
		//r1은 Motor타입이지만 Car 인스턴스주소를 담을수 있다.
		//이유는 Car는 Motor의 모든 기능을 상속받았기 때문에,
		//Car안에 Motor내용이 있어서 가능하다.
		//문법:레퍼런스는 서브 클래스의인스턴스를 가리킬 수 있다.
		Motor r1 = new Car();
		r1.cc = 100;
		r1.maker = "비트자동차";
		
		Car r2 = new SUV();
		r2.cc = 100;
		r2.maker = "비트 자동차";
		r2.capacity = 4;
		
		Motor r3 = new SUV();
		r3.cc =200;
		r3.maker = "비트 자동차";
		
		//자식클래스의 레퍼런스는 수퍼 클래스 인스턴스를 가리킬수 있는가?
		//=> 허락되지 않는다.컴파일 오류
		//=>왜? 수퍼클래스의 인스턴스 하위 클래스가 가져야할 변수가 메서드가 없을수  있기 때문이다.
		//SUV r4=new CAR();
	}

}
/*
 * 레퍼런스에 저장할 수 있는 주소
 * => 해당 타입및 서브 클래스의 인스턴스 주소를 저장 할 수 있다.
 * => 그러나 수퍼클래스의 인스턴스 주소는 저장할 수 없다.
 */
