package ex_07_01;

import java.util.Scanner;

public class Ex4_21 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
		System.out.println("�������� ǥ�� �մϴ�.");
		System.out.print("�ܼ���:");
		int n = stdln.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j=1;j<=n;j++)
				System.out.print("*");
			   System.out.println();
			   
			
		}
			
	}

}
