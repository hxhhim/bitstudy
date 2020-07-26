package edu.exam02.array04;

//int배열 10개를 생성하고
//1~10까지 담아라
//그리고 배열에서 1개씩 꺼내서 총합을 구해라
public class SumArray {

	public static void main(String[] args) {
		int[] nums;
		nums = new int[10];
		
		for(int i=9, cnt= 1; i>=0; i--,cnt++) {
			nums[i] = cnt ;
		}
//		for(int i=9; i>=0;i--) {
//			nums[i] =10-i;
//		}
		for (int i=0; i<10; i++) {
			System.out.printf("nums[%d]=%d\n",i,nums[i]);
		}
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum += nums[i] ;
		}
		System.out.println("\n총합은"+sum);


	}

}
