package ex_07_01;

import java.util.Scanner;

public class ex4_4_1 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("정수 A:"); int a = stdln.nextInt();
		System.out.print("정수 B:"); int b = stdln.nextInt();
		
		if (a>b) {
			int t = a; a = b; b = t;
		}
		do {
			System.out.print(a+" ");
				a = a + 1;
		}while(a<=b);
		System.out.println();
		stdln.close();
	}

}
