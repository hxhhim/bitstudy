package Ex016;

import java.util.Scanner;

/*
 * �̸�? ȫ�浿
 * ��ȭ? 010-111-1111
 * �̸���? hong@test.com
 * ȸ��? ��Ʈķ��
 * ����? �븮
 * ��� �Է��Ͻðڽ��ϱ�(y/n)y
 * -------------------------------------
 * �̸�? �Ӳ���
 * ��ȭ? 010-222-3333
 * �̸���? lim@test.com
 * ȸ��? ��Ʈķ��
 * ����? ��� 
 * ��� �Է��Ͻðڽ��ϱ�(y/n)y
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
		System.out.println("[���� > ����ó]");
		System.out.printf("%s %s %s %s %s\n",
				contact.name,
				contact.tel,
				contact.email,
				contact.company,
				contact.position);
	}
	static boolean prompt(){
		System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/n) ");
		String answer = keyScanner.nextLine();
		if(answer.equals("n"))
			return true;
		return false;
	}
	static Contact inputContact() {
		Contact  contact  = new Contact();
		System.out.println("[���� > ����ó]");
		System.out.print("�̸�? ");
		contact.name = keyScanner.nextLine();
		System.out.print("��ȭ? ");
		contact.tel = keyScanner.nextLine();
		System.out.print("�̸���? ");
		contact.email = keyScanner.nextLine();
		System.out.print("ȸ�� ? ");
		contact.company = keyScanner.nextLine();
		System.out.print("����? ");
		contact.position = keyScanner.nextLine();
		return contact;
	}

}






