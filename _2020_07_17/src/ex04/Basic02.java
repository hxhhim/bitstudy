package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    ����ڰ� 0�� �Է��ϱ� ������ ������ �Է��ؼ� ��ȯ�ϴ�
    �޼��带 �����ϰ� ����ϼ���
  int[] getInputNums();
  	
  	����ڿ��� ������ �Է¹���
  	�Է¹��� ������ int[]�� �����ϰ�
  	0�� �Է¹����� �迭�� ���
 */

public class Basic02 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
				
		getInputNums();
	}
	
	public static void getInputNums() {
		ArrayList<Integer> nums = new ArrayList<>();
		while(true) {
			System.out.println("������ �Է��ϼ���.");
			int num = sc.nextInt();
			if(num==0) {
				System.out.println("�Է��� �����մϴ�.");
				break;
			}
			nums.add(num);
		}
		for(Integer n :nums) {
			System.out.print(n+" ");
		}
	}

}
