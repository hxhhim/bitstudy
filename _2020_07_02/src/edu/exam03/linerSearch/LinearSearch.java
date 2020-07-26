package edu.exam03.linerSearch;

import java.util.Scanner;

//배열에 20개의 숫자를 초기화 하고 
//특정 숫자가 index 몇번에 있는 지 반환하는 메서드 구현
//없으면 -1을 반환한다.
//메서드를 만들고 사용해 봅시다.


public class LinearSearch {

	public static int linearSearch(int[] ar, int num) {
		int idx=-1;
				
			for(int i=0; i<ar.length;i++) {
			if(ar[i]==num) {
				System.out.println("찾았다.");
				idx = i;
				break;}
			}
				
		 return idx;
	}
	public static void main(String[] args) {
		int[] arr = {23,22,6,62,87,12,9988,72,1,21,5,26,73,38,46,29,56,52,2};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색숫자입력(-1이면 exit): ");
			int num = sc.nextInt();
			if (num ==-1)
				break;
			int idx = linearSearch(arr,num);
			if(idx == -1)
				System.out.println("찾을수 없습니다.");
			else
				System.out.printf("%d번째 있습니다\n", idx+1);
					
		}
		System.out.println("종료합니다.");
		sc.close();
	}

}
