package Ex02;

import java.util.Scanner;

/*
 * �̸�?ȫ�浿
 * ��ȭ?010-1111-1111
 * �̸���?hong@test.com
 * ȸ��?��Ʈķ��
 * ����?�븮
 * ����Է��Ͻðڽ��ϱ�?(y/n)
 * --------------------
 * �̸�?�Ӳ���
 * ��ȭ?010-222-3333
 * �̸���?lim@test.com
 * ȸ��?��Ʈķ��
 * ����?���
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
		System.out.print(contact.name+" "+contact.phone+" "+contact.email+" "+contact.company+" "+contact.rank);
		System.out.println();
	}

}
