package test;
//8) 5행 5열의 배열에 for 문을 이용해서 다음과 같이 저장하고 출력하는 프로그램을 작성 
//하시오.
//
//1
//2   3
//4   5   6
//7   8   9   10
//11  12  13  14  15

import java.util.Arrays;

public class ex08 {

	public static void main(String[] args) {
		
		int [][] arr = new int[5][5];
		int num=1;
		int num1=1;
			for(int i=0;i<5;i++) {
				for(int j=0;j<num1;j++) {
					arr[i][j]=num;
					num++;
				}
				num1++;
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}
