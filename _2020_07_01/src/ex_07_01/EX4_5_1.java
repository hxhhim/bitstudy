package ex_07_01;

import java.util.Scanner;

public class EX4_5_1 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.println("ī��Ʈ�ٿ� �մϴ�.");
		int x;
		do {
			System.out.print("���� ������:");
			 x= stdln.nextInt();
		}while(x <=0);
		
		while(x>=0)
			System.out.println(x++);
		System.out.println("x�� ����" + x + "�� �ƽ��ϴ�.");

	}

}
