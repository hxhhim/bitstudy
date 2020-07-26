package edu.exam02.array13;

public class TwoDim {

	public static void main(String[] args) {
		int [][] arr = new int[3][];
		arr[0] = new int [2];
		arr[1] = new int [4];
		arr[2] = new int [3];
		
		for(int i=0, cnt =1; i<arr.length ;i++) {
			for(int j=0; j<arr[i].length;j++)
				arr[i][j]= cnt++;
	   }
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				System.out.printf("arr[%d][%d] = %d\t",i,j,arr[i][j]);
				System.out.println();
		}
		
		
		int [] test = {10,11,12,13,14,15};
		arr[1] = test;
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				System.out.printf("arr[%d][%d] = %d\t",i,j,arr[i][j]);
				System.out.println();
		}
		
		
		}
	}

