package edu.exam02.needsarray01;

import java.util.Random;

/*
 * int 배열 10개생성하고
 * 1~10까지 저장하고 
 * 배열에서 1개씩 거내서 총합을 구하시오.
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
		}	//1~10까지 저장하기
		
		
		for(int i=0;i<kor.length;i++) {
			System.out.print(kor[i]+",");
		}
		System.out.println();
		for(int i=0; i<kor.length;i++) {
			sum += kor[i];
		}
		System.out.println("총합은 :"+sum+"입니다");
	}

}
