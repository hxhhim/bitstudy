package ex;

import java.util.Scanner;

public class Ex6_6_1 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
		System.out.print("��� ��:");
		int n = stdln.nextInt();
		int[] a = new int[n];
		
		for(int j=0;j<n;j++) {
			System.out.print("a["+j+"]=");
			a[j] = stdln.nextInt();
		}
		System.out.print("ã�� ����:");
		int key = stdln.nextInt();
		
		int i;
		for(i=0; i<n; i++)
			if(a[i] == key)
				break;
		
		if(i<n)
			System.out.println("�� ���� a["+i+"]�� �ֽ��ϴ�.");
		else
			System.out.println("�ش簪�� �������� �ʽ��ϴ�.");

	}

}
/*
*	for(i=n-1; i>=0; i--)
*		if(a[i] ==key)
*		break;
*	�ڿ��ִ� ��� ã��
*/