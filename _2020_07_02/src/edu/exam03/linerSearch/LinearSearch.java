package edu.exam03.linerSearch;

import java.util.Scanner;

//�迭�� 20���� ���ڸ� �ʱ�ȭ �ϰ� 
//Ư�� ���ڰ� index ����� �ִ� �� ��ȯ�ϴ� �޼��� ����
//������ -1�� ��ȯ�Ѵ�.
//�޼��带 ����� ����� ���ô�.


public class LinearSearch {

	public static int linearSearch(int[] ar, int num) {
		int idx=-1;
				
			for(int i=0; i<ar.length;i++) {
			if(ar[i]==num) {
				System.out.println("ã�Ҵ�.");
				idx = i;
				break;}
			}
				
		 return idx;
	}
	public static void main(String[] args) {
		int[] arr = {23,22,6,62,87,12,9988,72,1,21,5,26,73,38,46,29,56,52,2};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�˻������Է�(-1�̸� exit): ");
			int num = sc.nextInt();
			if (num ==-1)
				break;
			int idx = linearSearch(arr,num);
			if(idx == -1)
				System.out.println("ã���� �����ϴ�.");
			else
				System.out.printf("%d��° �ֽ��ϴ�\n", idx+1);
					
		}
		System.out.println("�����մϴ�.");
		sc.close();
	}

}
