package edu.exam02.array11;

import java.util.Random;

/*
 * 2���� �迭
 * 	1���� �迭==> �л�5���� ��������
 * 	2���� �迭==> 3���� ���� 5���� ���� ����
 * 
 */
public class TwoDim {

	public static void main(String[] args) {
		int[][] kor = new int[3][5];
		int[] sum =new int[3];
		Random rd = new Random();
		
		
		
		System.out.println(kor + ", "+ kor.length);
		System.out.println(kor[0] + ", " +kor[0].length);
		System.out.println(kor[1] + ", " +kor[1].length);
		System.out.println(kor[2] + ", " +kor[2].length);

		for(int j = 0; j<3; j++) {
			for(int i = 0; i<5; i++)
				kor[j][i] = rd.nextInt(101);
		}
		
		for(int j = 0; j<3; j++) {
			for(int i = 0; i<5; i++)
				System.out.printf("kor[%d][%d] = %d\t", j,i,kor[j][i]);
			System.out.println();
		}
		
		
		for(int j = 0; j<3; j++) {
			for(int i = 0; i<5; i++)
				sum[j]+=kor[j][i];
	}
		
			System.out.println();
				
		for(int i=0; i<3;i++)
			System.out.println(sum[i] +",");
	}

}
