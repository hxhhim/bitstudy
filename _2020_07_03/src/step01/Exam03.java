package step01;

public class Exam03 {
	//1)값을 받고 리턴하는 메서드
	//=> 파라미터(parameter): 외부에서 입력한 값을 받는 변수
	// 	int func(int a, int b){}  예)a,b
	//=> 아규먼트(argument):메서드를 사용할 때 (호출할때)전달하는 값
	//  int result = func(10,20);  예)10,20
	//=>리턴타입 : 메서드를 실행한후 리턴하는 값의 데이터 타입.
	//  int func(float a, float b){}  예)int
	
	static int m1(int a, int b) {
		return a+b; //값을 리턴할때 return 명령을 사용한다.
	}
	
	//2)값을 받고 결과를 리턴하지 않는 메서드
	static void m2(int a, int b) {
		if(b==0) {
			return;// 그냥  return을 사용하면, 함수 실행을 즉시 멈추고 호출한 곳으로 간다.
		}
		System.out.println(a/b);
	}
	//3)값을 받지 않고 결과를 리턴하는 메서드
	static int m3() { //값을 받지 않는다고 void를 선언해서는 안된다.
		return 100; //int 타입의 값을 리턴하기로 했으면 반드시 그타입의 값을 리턴해야 한다.
	}
	//4) 값도 안받고 결과도 리턴하지 않는 메서드
	static void m4() {
		System.out.println("?????");
	}
	static void fm() {
		System.out.println("fm()");
	}
	static void fm(int a) {
		System.out.println(a);
	}
	static void fm(short a) {
		System.out.println("short"+a);
	}
	static void fm(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		//1)메서드 사용
		int result =  m1(10,20);
		System.out.println(result);
		
		//2)번 메서드 사용
		m2(5,2);
		
		//3)번 메서드 사용
		System.out.println(m3());
		
		//4)번 메서드 사용
		m4();
		
		//System.out.println(m4()); 리턴값이 없어서 오류
		fm();
		fm(1);
		fm((short)2);
		fm(1,2);
		System.out.println();
		

	}

}
