package ex;

import java.util.Scanner;

public class Ex6_7_1 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		final int number = 6;
		int[][] point = new int[number][2];
		int[] sumStudent = new int[number];
		int[] sumSubject = new int[2];
		
		System.out.printf("%d���� ����, ���� ������ �Է��ϼ���.\n", number);
		
		for(int i = 0; i<number ; i++) {
			System.out.printf("%2d�� ����:",i+1);
			point[i][0] = stdln.nextInt();
			System.out.print("      ����:");
			point[i][1] = stdln.nextInt();
			
			sumStudent[i] = point[i][0] + point[i][1];
			sumSubject[0] +=point[i][0];
			sumSubject[1] +=point[i][1];
					
		}
			System.out.println("no. ����   ����  ���");
			for(int i=0; i<number;i++)
				System.out.printf("%2d%6d%6d%6.1f\n",i+1,point[i][0],point[i][1],(double)sumStudent[i]/2);
				System.out.printf("���%6.1f%6.1f\n", (double)sumSubject[0]/number,(double)sumSubject[1]/number);		
						

}
	
}