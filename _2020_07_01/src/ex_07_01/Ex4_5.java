package ex_07_01;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int a = sc.nextInt();
		
			while(0>a) {
				System.out.println("����� �Է��ϼ���");
				a = sc.nextInt();
			}
			int b = a;
				for(int j=0; j<b+1; j++) {
					System.out.println(a);
					++a;
				}
					
		System.out.println("�Է°���:"+b+"�Դϴ�");	
		sc.close();
	}
}

