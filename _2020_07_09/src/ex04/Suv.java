package ex04;

public class Suv extends Car{
	int weght;
	public Suv() {
		super(); //<=슈퍼 클래스의 기본 생성자를 호출하는 명령이 숨겨져 있다.
		System.out.println("Suv() 호출됨");
		
	}
}
