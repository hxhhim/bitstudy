package ex_07_01;

import java.util.Scanner;

public class Ex4_14_1 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.println("1���� n ������ ���� ���մϴ�.");
		int n;
		do {
			System.out.print("n�� ��:");
				n = stdln.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		for(int i=0; i<=n;i++)
			sum += i;
		System.out.print("1����"+n+"������ ���� "+ sum +"�Դϴ�.");
	}

}
