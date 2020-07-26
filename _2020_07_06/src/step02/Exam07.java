package step02;

public class Exam07 {

	public static void main(String[] args) {
		Board6 b1 = new Board6();
		b1.printInfo();
		java.util.Date today = new java.util.Date();
		String str = today.toString();
		System.out.println(str);
	//	java.sql.Date today = new java.sql.Date();//컴파일 오류 기본생성자가 없는 함수
	}

}
