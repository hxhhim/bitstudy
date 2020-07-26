package step01.ex01;

public class Exam01_1 {

	public static void main(String[] args) {
		Motor r1= new Motor();
		//r1 레퍼런스는 Motor();
		//즉 Motor에 있는 도구만 사용활수 있다.
		//물론,Motor의 슈퍼클래스도구도 내것처럼사용가능
		r1.cc = 100;
		r1.maker = "비트자동차";
	//	r1.capacity = 4;

	}

}
