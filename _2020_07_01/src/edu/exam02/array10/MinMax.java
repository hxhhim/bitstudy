package edu.exam02.array10;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 5���� ������ �Է¹ް�
 * �ּҰ� �ִ밪�� ���ؼ� ���.
 */

public class MinMax {

	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);
		 System.out.println("������ �Է��ϼ���:");
		 for (int i=0,j=0; i<5; i++)
			 int num =sc.nextInt();
		 	 int[]  arr[i] = num;
*/			 
		int[] score = new int[5];
		Scanner sc =new Scanner(System.in);
		
		for (int i= 0;i<score.length; i++) {
			System.out.print(i+" �����Է�:");
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);//���������� ã�ƺ���
		System.out.println("�ִ밪"+score[score.length -1]);
		System.out.println("�ּҰ�"+score[0]);
		
		sc.close();
		
		
	}

}
