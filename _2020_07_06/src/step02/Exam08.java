package step02;

//1)System.in : 키보드에 입력한 값을 읽어 들이는 도구
//2)Scanner : 특정 형식으로 데이터를 변경해 주는 도구

public class Exam08 {

	public static void main(String[] args) {
		java.util.Scanner keyScanner = new java.util.Scanner(System.in);
		String str = keyScanner.nextLine();// 입력 문자를 줄 단위로 잘라준다.
		System.out.println(str);
		

	}

}
