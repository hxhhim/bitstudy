package edu.exam02.array04;

//int�迭 10���� �����ϰ�
//1~10���� ��ƶ�
//�׸��� �迭���� 1���� ������ ������ ���ض�
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
		System.out.println("\n������"+sum);


	}

}
