package step02;

import java.util.Scanner;

/*
 * 주제:String 클래스 - toUpperCase(), toLowerCase(),trim()
 */
public class Exam01_9 {

	public static void main(String[] args) {
		String str1= "     Hello,World!   ";
		System.out.printf("[%s]\n",str1.toUpperCase());//대문자로 변환
		System.out.printf("[%s]\n",str1.toLowerCase());//소문자로 변환
		System.out.printf("[%s]\n",str1.trim());//좌우 공백문자 지우기
		
		Scanner keyScan = new Scanner(System.in);
		System.out.print("입력?(yes/no)");//Yes yes YES
		String message = keyScan.nextLine();
		
//		if(message.contentEquals("y")) {
//			System.out.println("y를 입력하셨습니다.");
//		}
		if(message.trim().toLowerCase().equals("yes")) {
			System.out.println("y를 입력하셨습니다.");
		}else {
			System.out.println("n을 입력하셨습니다.");
			
		}
		keyScan.close();
	}

}
