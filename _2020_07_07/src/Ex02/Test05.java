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
public class Test05 {
	static Scanner keyScanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Contact[] contacts =new Contact[10];
		int i =0;
		
		Contact contact;
		String answer;
		
		while(i<10) {
			
			
			contacts[i] = inputContact();
			i++;
			
			if(prompt())
				break;
		}
		for(int j= 0; j<i;j++) {
			printContact(contacts[j]);
		}
		keyScanner.close();
		
	}
	static Contact inputContact() {
		Contact contact = new Contact();
		
		System.out.print("이름?");
		contact.name = keyScanner.nextLine();
		System.out.print("전화?");
		contact.phone = keyScanner.nextLine();
		System.out.print("이메일?");
		contact.email = keyScanner.nextLine();
		System.out.print("직위?");
		contact.rank = keyScanner.nextLine();
		return contact;
	}
	static boolean prompt() {
		System.out.print("계속입력하시겠습니까?(y/n)");
		String answer = keyScanner.nextLine();
		if(answer.equals("n"))
			return true;
		return false;
	}
	static void printContact(Contact contact) {
		System.out.print(contact.name+" "+contact.phone+" "+contact.email+" "+contact.company+" "+contact.rank);
		System.out.println();
	}

}
