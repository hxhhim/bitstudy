package edu.exam02.needsarray01;

import java.util.Random;

/*
 * int �迭 10�������ϰ�
 * 1~10���� �����ϰ� 
 * �迭���� 1���� �ų��� ������ ���Ͻÿ�.
 */
public class SumArray {

	public static void main(String[] args) {
		int[] kor = new int[10];
		int sum =0;
		Random rd =new Random();
/*		for(int i=0;i<kor.length;i++) {					
			kor[i] = rd.nextInt(10)+1;
		}*/
		
		for (int i=0;i<10;i++) {
			kor[i] = i+1;
		}	//1~10���� �����ϱ�
		
		
		for(int i=0;i<kor.length;i++) {
			System.out.print(kor[i]+",");
		}
		System.out.println();
		for(int i=0; i<kor.length;i++) {
			sum += kor[i];
		}
		System.out.println("������ :"+sum+"�Դϴ�");
	}

}
