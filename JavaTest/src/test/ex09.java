package test;

import java.util.Arrays;

//9) 5�� 5���� �迭�� for ���� �̿��ؼ� ������ ���� �����ϰ� ����ϴ� ���α׷��� �ۼ� 
//�Ͻÿ�.
//
//1    2    3    4    5
//10   9    8    7    6
//11  12   13   14   15
//20  19   18   17   16
//21  22   23   24   25
public class ex09 {

	public static void main(String[] args) {
		int [][] arr = new int[5][5];
		int num=1;
		for(int i=0;i<5;i++) {
			if(i%2==0) {
				for(int j=0;j<5;j++) {
				   arr[i][j]=num;
					   num++;
				   }
			}else {
				for(int j=4;j>=0;j--) {
					 arr[i][j]=num;
					   num++;
				   }
				}
			}
		for(int i=0;i<5;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}


	}

}
