package ex_07_01;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int a = sc.nextInt();
		int sum = 0;
		for(int i=1; i<a+1;i++) {
			sum += i;
			System.out.print(i+"+");
		}
		System.out.println();
		System.out.println("����:"+sum+"�Դϴ�");
		sc.close();
	}
	

}
