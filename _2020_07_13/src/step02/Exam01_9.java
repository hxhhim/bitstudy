package step02;

import java.util.Scanner;

/*
 * ����:String Ŭ���� - toUpperCase(), toLowerCase(),trim()
 */
public class Exam01_9 {

	public static void main(String[] args) {
		String str1= "     Hello,World!   ";
		System.out.printf("[%s]\n",str1.toUpperCase());//�빮�ڷ� ��ȯ
		System.out.printf("[%s]\n",str1.toLowerCase());//�ҹ��ڷ� ��ȯ
		System.out.printf("[%s]\n",str1.trim());//�¿� ���鹮�� �����
		
		Scanner keyScan = new Scanner(System.in);
		System.out.print("�Է�?(yes/no)");//Yes yes YES
		String message = keyScan.nextLine();
		
//		if(message.contentEquals("y")) {
//			System.out.println("y�� �Է��ϼ̽��ϴ�.");
//		}
		if(message.trim().toLowerCase().equals("yes")) {
			System.out.println("y�� �Է��ϼ̽��ϴ�.");
		}else {
			System.out.println("n�� �Է��ϼ̽��ϴ�.");
			
		}
		keyScan.close();
	}

}
