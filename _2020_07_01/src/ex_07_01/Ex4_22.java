package ex_07_01;

import java.util.Scanner;

public class Ex4_22 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
		System.out.println("´Ü¼ö´Â?:");
		int n = stdln.nextInt();
		
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=i;j++)
				System.out.print("*");
			  System.out.println();
		}
		
	}

}
