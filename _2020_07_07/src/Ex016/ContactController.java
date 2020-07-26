package Ex016;

import java.util.Scanner;

/*
 * 이름? 홍길동
 * 전화? 010-111-1111
 * 이메일? hong@test.com
 * 회사? 비트캠프
 * 직위? 대리
 * 계속 입력하시겠습니까(y/n)y
 * -------------------------------------
 * 이름? 임꺽정
 * 전화? 010-222-3333
 * 이메일? lim@test.com
 * 회사? 비트캠프
 * 직위? 사원 
 * 계속 입력하시겠습니까(y/n)y
 * 
 */
public class ContactController {

	static Scanner keyScanner = new Scanner(System.in);
	public static void service() {
		
		Contact[] contacts = new Contact[10];
		int i = 0;

		while(true) {
		    contacts[i++] = inputContact();
		    if(prompt())
		    	break;
		}
		
		for(int x = 0; x < i;x++) {
			printContact(contacts[x]);
		}
	}
	
	static void printContact(Contact contact){
		System.out.println("[메인 > 연락처]");
		System.out.printf("%s %s %s %s %s\n",
				contact.name,
				contact.tel,
				contact.email,
				contact.company,
				contact.position);
	}
	static boolean prompt(){
		System.out.print("계속 입력하시겠습니까?(y/n) ");
		String answer = keyScanner.nextLine();
		if(answer.equals("n"))
			return true;
		return false;
	}
	static Contact inputContact() {
		Contact  contact  = new Contact();
		System.out.println("[메인 > 연락처]");
		System.out.print("이름? ");
		contact.name = keyScanner.nextLine();
		System.out.print("전화? ");
		contact.tel = keyScanner.nextLine();
		System.out.print("이메일? ");
		contact.email = keyScanner.nextLine();
		System.out.print("회사 ? ");
		contact.company = keyScanner.nextLine();
		System.out.print("직위? ");
		contact.position = keyScanner.nextLine();
		return contact;
	}

}






