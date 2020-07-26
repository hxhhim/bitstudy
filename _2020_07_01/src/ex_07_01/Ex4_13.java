package ex_07_01;

import java.util.Scanner;

public class Ex4_13 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		int x;
		do {
			System.out.print("양의 정수값:");
			 x = stdln.nextInt();
		}while(x<=0);
		
		for(int i=0; i<= x; i++)
			System.out.println(i);
	}

}
