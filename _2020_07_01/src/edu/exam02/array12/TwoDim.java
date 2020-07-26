package edu.exam02.array12;

import java.util.Random;

/*
 * 4x6 배열을 생성하고
 * 1부터 순차적으로 대입하고
 * 출력하세요.
 * [4][6]
 */
public class TwoDim {

	public static void main(String[] args) {
		int [][] kor = new int[4][6];
		int [] sum = new int[4];
		int [] sum1 = new int[6];
		Random rd = new Random();
		
/*		for(int j= 0; j<4; j++) {
			for(int i=0; i <6; i++)
				kor[j][i] = rd.nextInt(101);
		}*/

 		for(int j= 0,cnt=1; j<4; j++) {
			for(int i=0; i <6; i++)
				kor[j][i] = cnt++;
		}
//		1부터 순차적으로 입력
				

		
		for(int j= 0; j<4; j++) {
			for(int i=0; i <6; i++)
				System.out.printf("kor[%d][%d] = %d\t",j,i,kor[j][i]);
			System.out.println();
		}
		for(int j= 0; j<4; j++) {
			for(int i=0; i <6; i++)
				sum[j]+=kor[j][i];
		}
		for(int j =0 ; j<6; j++) {
			for(int i=0; i<4;i++)
				sum1[j]+=kor[i][j];
		}
			
		
			System.out.println();
		
		for(int i=0; i<4; i++)
			System.out.println(sum[i]+",");
		
		System.out.println();
		
		for(int i=0; i<6; i++)
			System.out.println(sum1[i]+",");
			
	}	
}
	
	
