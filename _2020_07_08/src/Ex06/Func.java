package Ex06;

import java.util.Scanner;

public class Func {
	static Scanner keyScanner = new Scanner(System.in);
	static Contact inputContact() {
		Contact contact = new Contact();
		System.out.println("[메인>연락처]");
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
		System.out.println("[메인>연락처]");
		System.out.print(contact.name+" "+contact.phone+" "+contact.email+" "+contact.company+" "+contact.rank);
		System.out.println();
	}
	
}

