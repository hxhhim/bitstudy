package ex_07_01;

import java.util.Scanner;

/*
 * ���� �������� �о �� �ڸ����� ���
 * ������ ���� 0�� �ɶ����� ������ ��Ƚ���� �ڸ����� ���
 */
public class Ex4_9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� �Է����ּ���:");
		int x;
		do {
			System.out.print("���� ������:");
				x = sc.nextInt();
			}while(x<=0);
		
		int digit = 0;
		while(x > 0) {
			digit++;
				x/=10;
		}
		System.out.println("�Է��� ���ڴ� " + digit + "�ڸ��Դϴ�.");
		
	}

}
