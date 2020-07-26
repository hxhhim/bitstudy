package edu.exam02.array10;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 5개의 정수를 입력받고
 * 최소값 최대값을 구해서 출력.
 */

public class MinMax {

	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);
		 System.out.println("정수를 입력하세요:");
		 for (int i=0,j=0; i<5; i++)
			 int num =sc.nextInt();
		 	 int[]  arr[i] = num;
*/			 
		int[] score = new int[5];
		Scanner sc =new Scanner(System.in);
		
		for (int i= 0;i<score.length; i++) {
			System.out.print(i+" 점수입력:");
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);//내림차순은 찾아볼것
		System.out.println("최대값"+score[score.length -1]);
		System.out.println("최소값"+score[0]);
		
		sc.close();
		
		
	}

}
