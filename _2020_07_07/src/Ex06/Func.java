package Ex06;

import java.util.Scanner;

public class Func {
	static Scanner keyScanner = new Scanner(System.in);
	static Contact inputContact() {
		Contact contact = new Contact();
		System.out.println("[����>����ó]");
		System.out.print("�̸�?");
		contact.name = keyScanner.nextLine();
		System.out.print("��ȭ?");
		contact.phone = keyScanner.nextLine();
		System.out.print("�̸���?");
		contact.email = keyScanner.nextLine();
		System.out.print("����?");
		contact.rank = keyScanner.nextLine();
		return contact;
	}
	static boolean prompt() {
		System.out.print("����Է��Ͻðڽ��ϱ�?(y/n)");
		String answer = keyScanner.nextLine();
		if(answer.equals("n"))
			return true;
		return false;
	}
	static void printContact(Contact contact) {
		System.out.println("[����>����ó]");
		System.out.print(contact.name+" "+contact.phone+" "+contact.email+" "+contact.company+" "+contact.rank);
		System.out.println();
	}
	
}

