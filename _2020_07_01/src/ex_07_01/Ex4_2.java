package ex_07_01;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);
		int x;
		do {
			System.out.println("���ڸ� ������:");
				x = stdln.nextInt();
		}while(x<100||x>999);
		System.out.print("�Է��� ���� " + x +"�Դϴ�.");
		}
/*		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���:");
		int num = sc.nextInt();
		if(num<100) {
			System.out.println("�ٽ��Է��ϼ���:");
		}
		else if(num>999) {
			System.out.println("�ٽ��Է��ϼ���:");
		}else
			System.out.println("3�ڸ����������� �Է��Ͽ����ϴ�.");
			
		sc.close();
*/	}


//�ٽ� �Է��ϼ��� �Ŀ� �ٽ� if������ ���ư��°� ã�ƺ���