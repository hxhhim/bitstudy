package edu.exam02.Ex;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex3_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù���� ������ �Է��ϼ���");
		int a = sc.nextInt();
		System.out.println("�ι��� ������ �Է��ϼ���");
		int b = sc.nextInt();

		if(a < b) {
			int t =a;
				a =b;
				b =t;
		}
		
		System.out.println("���� a��"+ a +"�Դϴ�.");
		System.out.println("���� b��"+ b +"�Դϴ�.");
/*		Integer [] arr = {a,b};
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
*/	}

}
