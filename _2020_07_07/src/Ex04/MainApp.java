package Ex04;

import java.util.Scanner;

/*
 * [�޴�]
 * 1.�Խ���
 * 2.����ó
 * 0.����
 * ----------
 * �޴� ��ȣ�� �Է��ϼ���.>1
 * [����>�Խ���]
 * ����?aaa
 * ����?bbb
 * ��ȣ?1111
 * ��� �Է��ϰڽ��ϱ�?(y/n)n
 * [����>�Խ���]
 * 1.aaaa , bbb,1111,2020-07-07,0
 * �޴���ȣ�� �Է��ϼ���>2
 * [����>����ó]
 * �̸�?ȫ�浿
 * ��ȭ?1111
 * �̸���?hong@test.com
 * ȸ��? ��Ʈ ķ��
 * ����? �븮
 *  ��� �Է��ϰڽ��ϱ�?(y/n)n
 *  [�޴�>����ó]
 *  ȫ�浿,1111,hong@test.com,��Ʈķ��,�븮
 
 *  
 * [�޴�]
 * 		1.�Խ���
 * 		2.����ó
 * 		0.����
 * ------------------------
 * �޴���ȣ�� �Է��ϼ���>1
 * �Խ���
 *[�޴�]
 * 		1.�Խ���
 * 		2.����ó
 * 		0.����
 * ------------------------
 *�޴���ȣ�� �Է��ϼ���>2
 *����ó
 * [�޴�]
 * 		1.�Խ���
 * 		2.����ó
 * 		0.����
 * ------------------------
 *�޴���ȣ�� �Է��ϼ���>3
 *�ش�޴��� �����ϴ�.
 ** [�޴�]
 * 		1.�Խ���
 * 		2.����ó
 * 		0.����
 * ------------------------

 */
public class MainApp {

	public static void main(String[] args) {
/*		Scanner str = new Scanner(System.in);
		
		int menu;
		while(menu!=0)
		System.out.println("[�޴�]");
		System.out.println(" 1.�Խ���");
		System.out.println(" 2.����ó");
		System.out.println(" 0.����");
		System.out.println("------------");
		System.out.println("�޴���ȣ�� �Է��ϼ���>");
		menu = str.nextInt();
		if(menu==1)
			System.out.println("�Խ���");
		else if(menu==2)
			System.out.println("����ó");
		else 
			System.out.println("�ش�޴��� �����ϴ�.");
*/		
		Scanner keyScanner = new Scanner(System.in);
		label1:
		while(true) {
		System.out.println("-------------------------");
		System.out.println("[�޴�]");
		System.out.println("1.�Խ���");
		System.out.println("2.����ó");
		System.out.println("0.����");
		System.out.println("-------------------------");
		System.out.println("�޴� ��ȣ�� �Է��ϼ���>");
		String menuNo = keyScanner.nextLine();
		
		switch(menuNo) {
		case "1":
		//	System.out.println("�Խ���");
			BoardController.service();
			break;
		case "2":
		//	System.out.println("����ó");
			ContactController.service();
			break;
		case "0":
			break label1;
		default:
			System.out.println("�ش�޴��� �����ϴ�.");
		}
		}
		keyScanner.close();
	}
	
}
