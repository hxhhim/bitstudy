package _2020_06_29;

import java.util.Scanner;

public class Ex2_7 {
public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���:");
		num = sc.nextInt();
		int x = 0, y = 0;
		x = num/10*10;
		y = num%10;
		System.out.println("�Է��� ���ڿ��� ������ �ڸ����� ����:"+ x +"�Դϴ�");
		System.out.println("�Է��� ���ڿ��� ������ �ڸ����� :"+ y +"�Դϴ�");
	}
}
