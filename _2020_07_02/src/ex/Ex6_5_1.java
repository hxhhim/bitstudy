package ex;

import java.util.Scanner;

public class Ex6_5_1 {

	public static void main(String[] args) {
		 Scanner stdln = new Scanner(System.in);
		 
		 System.out.print("��� ��:");
		 int n = stdln.nextInt();
		 int[] points = new int[n];
		 
		 System.out.println("������ �Է��ϼ���.");
		 int sum = 0;
		 for(int i=0; i<n;i++) {
			 System.out.print((i+1)+"���� ����:");
		 	 points[i] = stdln.nextInt();
		 	 sum += points[i];
		 }
		 
		 int max = points[0];
		 int min = points[0];
		 
		 for(int i =1; i<n; i++) {
			 if(points[i]>max)max =points[i]; //�ϳ��� ���ؼ� ū���� max�� ��� �ű�
			 if(points[i]<min)min =points[i]; //�ϳ��� ���ؼ� �������� min�� ��� �ű�
		 }
		 System.out.println("�հ�� " + sum +"���Դϴ�.");
		 System.out.println("����� " + (double)sum/n+"���Դϴ�.");
		 System.out.println("�ְ����� "+ max + "���Դϴ�.");
		 System.out.println("�������� "+ min + "���Դϴ�.");
	}

}
