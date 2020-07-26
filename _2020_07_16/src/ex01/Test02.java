package ex01;

public class Test02 {

	public static void main(String[] args) {
	
	//  다형성 변수 규칙에 따라 인터페이스 레퍼런스 변수에 
	//	그 인터페이스를 구현한 클래스의 객체(의 주소)를 저장할 수 있다.
	//	Calc c = new Calc(); //인터페이스는 규칙이기 때문에 인스턴스를 만들수 없다.
		Calc c2 = new Calcimpl();
		
		//"인터페이스의 구현체"
		//=> Calcimpl 클래스처럼 인터페이스 규칙에 따라 만든 클래스를 부르는 말.
		System.out.println(c2.plus(10, 30));
	}

}
