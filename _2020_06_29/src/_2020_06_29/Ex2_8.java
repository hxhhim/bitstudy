package _2020_06_29;

import java.util.Scanner;

public class Ex2_8 {

	public static void main(String[] args) {

		int num1 = 0, num2 = 0, sum = 0,avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���:");
		num1 = sc.nextInt();
		System.out.println("���ڸ� �Է��ϼ���:");
		num2 = sc.nextInt();
		sum = num1 + num2;
		avg = sum/2;
		System.out.println("�μ��� ����:"+sum);
		System.out.println("�μ��� �����:"+avg);
		

	}

}
