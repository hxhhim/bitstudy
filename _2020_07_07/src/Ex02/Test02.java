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
public class Test02 {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		
		Contact contact;
		while(true) {
			contact = new Contact();
			System.out.print("�̸�?");
			contact.name = keyScanner.nextLine();
			System.out.print("��ȭ?");
			contact.phone = keyScanner.nextLine();
			System.out.print("�̸���?");
			contact.email = keyScanner.nextLine();
			System.out.print("����?");
			contact.rank = keyScanner.nextLine();
			System.out.print("����Է��Ͻðڽ��ϱ�?(y/n)");
			String answer = keyScanner.nextLine();
			if(answer.equals("n"))
				break;
		}
		System.out.print(contact.name+" "+contact.phone+" "+contact.email+" "+contact.company+" "+contact.rank);
		keyScanner.close();
		
	}

}
