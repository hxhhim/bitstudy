package ex_07_01;

import java.util.Scanner;

public class Ex4_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������n�� �Է��ϼ���:");
		int n = sc.nextInt();
		int y = n;
		int x =1;
		for(int i=0; i<y ;i++) {
			x = x*n;
			n--;
		}
		System.out.println("���Ѱ���:"+x+"�Դϴ�.");
		sc.close();
	}

}
