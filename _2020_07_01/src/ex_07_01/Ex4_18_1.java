package ex_07_01;

import java.util.Scanner;

public class Ex4_18_1 {

//�Է��� ������ ��� ����� ���� ǥ��
//����� ������ �������� ��
	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("������:");
		int n = stdln.nextInt();
		int cnt = 0;
		for(int i =1; i<=n; i++)
			if(n%i==0) {
				System.out.print(i+" ");
				cnt++;
				}
		System.out.println(n+"�� �����"+ cnt +"���Դϴ�.");

	}

}
