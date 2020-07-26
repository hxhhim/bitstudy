package ex_07_01;

import java.util.Scanner;

public class Ex4_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇cm부터:");
		int t = sc.nextInt();
		System.out.println("몇cm까지:");
		int t1 = sc.nextInt();
		System.out.println("몇cm단위:");
		int t2 = sc.nextInt();
		int c = (t1-t)/t2;
		
		System.out.println("신장 표준 체중");
		System.out.println("----------");
		
		
		for(int i=0; i<c+1 ; i++) {
			float n = (float)(t+(t2*i)-100)*0.9f;
			System.out.println((t+(t2*i))+"\t"+n);
		}

	}
}
