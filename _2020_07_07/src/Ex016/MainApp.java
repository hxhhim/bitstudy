package Ex016;
/*
 * [�޴�]
 * 1. �Խ���
 * 2. ����ó
 * 0. ����
 * ----------------------------
 * �޴� ��ȣ�� �Է��ϼ���>1
 * [���� > �Խ���]
 * ����? aaa
 * ����? bbb
 * ��ȣ? 1111
 * ��� �Է��Ͻðڽ��ϱ�?(y/n)n
 * [���� > �Խ���]
 * 1, aaa, bbb, 1111, 2020-07-07, 0
 * �޴� ��ȣ�� �Է��ϼ���> 2
 * [���� > ����ó]
 * �̸�? ȫ�浿
 * ��ȭ? 111
 * �̸���? hong@test.com
 * ȸ��? ��Ʈķ��
 * ����? �븮
 * ��� �Է��Ͻðڽ��ϱ�?(y/n)n
 * [���� > ����ó]
 * ȫ�浿, 111, hong@test.com, ��Ʈ ķ��, �븮 
 */

import java.util.Scanner;

/*
[�޴�]
* 1. �Խ���
* 2. ����ó
* 0. ����
--------------------------
�޴� ��ȣ�� �Է��ϼ���> 1
�Խ��� 
[�޴�]
* 1. �Խ���
* 2. ����ó
* 0. ����
--------------------------
�޴� ��ȣ�� �Է��ϼ���> 2
����ó
[�޴�]
* 1. �Խ���
* 2. ����ó
* 0. ����
--------------------------
�޴� ��ȣ�� �Է��ϼ���> 3
�ش� �޴��� �����ϴ�.
[�޴�]
* 1. �Խ���
* 2. ����ó
* 0. ����
--------------------------
�޴� ��ȣ�� �Է��ϼ���> 
*/

public class MainApp {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		BoardController.keyScanner = keyScanner;
	//	BoardController2.keyScanner = keyScanner;
	//	BoardController3.keyScanner = keyScanner;
		BoardController board1 = new BoardController("���� �Խ���");
		BoardController board2 = new BoardController("������ �Խ���");
		BoardController board3 = new BoardController("���� �Խ���");
		
		lable1:
		while(true) {
			System.out.println("------------------------------");
			System.out.println("[�޴�]");
			System.out.println("1. ���� �Խ���");
			System.out.println("2. ������ �Խ��� ");
			System.out.println("3. ���ߺ� �Խ���");
			System.out.println("4. ����ó");
			System.out.println("0. ����");
			System.out.println("-------------------------------");
			System.out.print("�޴� ��ȣ�� �Է� �ϼ���> ");
			String menuNo = keyScanner.nextLine();
		
			switch(menuNo) {
			case "1":
				//System.out.println("�Խ���");
				board1.service();
				break;
			case "2":
				//System.out.println("����ó");
				board2.service();
				break;
			case "3":
				board3.service();
			case "0":
				break lable1;
			default:
				System.out.println("�ش� �޴��� �����ϴ�.");
			}
		}
		keyScanner.close();
	}
	
}













