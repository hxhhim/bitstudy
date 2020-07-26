package ex_07_01;

import java.util.Scanner;

public class ex4_7_1 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("몇개의 *를 표시할까요?:");
		int n = stdln.nextInt();
		if(n>0) {
			int i = 0;
				while(i<n) {
					System.out.print('*');
					i++;
				}
				System.out.println();
				
		}

	}

}
