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
public class Test04 {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		
		Contact[] contacts =new Contact[10];
		int i =0;
		
		Contact contact;
		String answer;
		
		while(i<10) {
			contact = new Contact();
			
			System.out.print("�̸�?");
			contact.name = keyScanner.nextLine();
			System.out.print("��ȭ?");
			contact.phone = keyScanner.nextLine();
			System.out.print("�̸���?");
			contact.email = keyScanner.nextLine();
			System.out.print("����?");
			contact.rank = keyScanner.nextLine();
			
			contacts[i] = contact;
			i++;
			
			System.out.print("����Է��Ͻðڽ��ϱ�?(y/n)");
			answer = keyScanner.nextLine();
			if(answer.equals("n"))
				break;
		}
		for(int j= 0; j<i;j++) {
			System.out.print(contacts[j].name+" "+contacts[j].phone+" "+contacts[j].email+" "+contacts[j].company+" "+contacts[j].rank);
			System.out.println();
		}
		keyScanner.close();
		
	}

}
