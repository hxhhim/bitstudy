package ex_07_01;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.println("1���� n������ ���� ���մϴ�.");
		int n;
		do {
			System.out.print("n�� ��:");
			n = stdln.nextInt();
		}while(n<=0);
		int sum = 0;
		for(int i =1;i<n;i++) {
			System.out.print(i+"+");
				sum +=i;
		}
		System.out.print(n + "=");
		sum +=n;
		System.out.println(sum);
		

	}

}
