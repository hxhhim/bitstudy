package ex03;

public class B extends A {
/*
 * 슈퍼 클래스 A의 스태틱변수는 클래스 소속이기때문에
 * 직접 상속받는것이 아니다.
 * =>대신 자신의 것처럼 사용할수 있다.
 */
	static int var3;
	static void m() {
		//클래스 변수를 사용하려면 클래스명을 붙여야 한다.
		A.var1 = 100;
		
		//서브 클래스에서는 수퍼클래스의 스태틱 변수에 접근할수 있다.
		var1 = 200;
	//	var2 = 100;
		B.var3 = 200;
		var3 = 300;
	}
}
