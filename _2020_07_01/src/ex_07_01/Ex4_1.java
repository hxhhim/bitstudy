package ex_07_01;

import java.util.Scanner;

public class Ex4_1 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		int retry;
		do {
			System.out.print("������");
			int n = stdln.nextInt();
			
			if(n>0)
				System.out.println("���� ��� �Դϴ�.");
			else if(n<0)
				System.out.println("���� ���� �Դϴ�.");
			else
				System.out.println("���� 0 �Դϴ�.");
			System.out.println("�ٽ� �ѹ�? 1-Yes/0-No:");
				retry = stdln.nextInt();
		}while(retry==1);
		}
		
		
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� �ݺ�Ƚ���� �Է��ϼ���:");
		int b = sc.nextInt();
		for(int i=0;i<b;i++) {
			System.out.println("������ �Է��ϼ���:");
			int a = sc.nextInt();
			if(a>0) {
				System.out.println("�Է��� ������ ����Դϴ�.");
			}else if(a<0) {
				System.out.println("�Է��� ������ �����Դϴ�");
			}else {
				System.out.println("�Է��� ������ 0�Դϴ� .");
			
		}
	}
		System.out.println("�Ϸ�Ǿ����ϴ�.");
		sc.close();
*/	}


