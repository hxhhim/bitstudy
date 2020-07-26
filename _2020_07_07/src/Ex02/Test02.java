package Ex02;

import java.util.Scanner;

/*
 * 이름?홍길동
 * 전화?010-1111-1111
 * 이메일?hong@test.com
 * 회사?비트캠프
 * 직위?대리
 * 계속입력하시겠습니까?(y/n)
 * --------------------
 * 이름?임꺽정
 * 전화?010-222-3333
 * 이메일?lim@test.com
 * 회사?비트캠프
 * 직위?사원
 */
public class Test02 {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		
		Contact contact;
		while(true) {
			contact = new Contact();
			System.out.print("이름?");
			contact.name = keyScanner.nextLine();
			System.out.print("전화?");
			contact.phone = keyScanner.nextLine();
			System.out.print("이메일?");
			contact.email = keyScanner.nextLine();
			System.out.print("직위?");
			contact.rank = keyScanner.nextLine();
			System.out.print("계속입력하시겠습니까?(y/n)");
			String answer = keyScanner.nextLine();
			if(answer.equals("n"))
				break;
		}
		System.out.print(contact.name+" "+contact.phone+" "+contact.email+" "+contact.company+" "+contact.rank);
		keyScanner.close();
		
	}

}
