package Ex07;

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
public class ContactController {
	static Scanner keyScanner ;
	Contact[] contacts =new Contact[10];				
	int i =0;
	int j =0;
	String contactName;
	
	public ContactController(String contactName) {//������ String contactName���� �ܺο��� �޾Ƽ�
		this.contactName = contactName;			//�Խ��Ǹ��� �̸��� �����ϱ����ؼ�
	}
	public void service() {
					
		while(true) {
			System.out.printf("[����>%s\n",this.contactName);
			inputContact();
			if(prompt())
				break;
		}
		System.out.printf("[����>%s\n",this.contactName);
		for( j= 0; j<i;j++) {
			printContact();
		}
			

		}
	public void inputContact() {
		Contact contact = new Contact();
//		System.out.println("[����>����ó]");
		System.out.print("�̸�?");
		contact.name = keyScanner.nextLine();
		System.out.print("��ȭ?");
		contact.phone = keyScanner.nextLine();
		System.out.print("�̸���?");
		contact.email = keyScanner.nextLine();
		System.out.print("����?");
		contact.rank = keyScanner.nextLine();
		contacts[i++]=contact;
	}
	static boolean prompt() {
		System.out.print("����Է��Ͻðڽ��ϱ�?(y/n)");
		String answer = keyScanner.nextLine();
		if(answer.equals("n"))
			return true;
		return false;
	}
	public void printContact() {
		System.out.print(contacts[j].name+" "+contacts[j].phone+" "+contacts[j].email+" "+contacts[j].company+" "+contacts[j].rank);
		System.out.println();
	}


}

