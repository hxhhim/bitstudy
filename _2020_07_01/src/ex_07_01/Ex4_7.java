package ex_07_01;

import java.util.Scanner;

public class Ex4_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를입력하세요:");
		int a = sc.nextInt();
		for(int i=0; i<a ; i++) {
			System.out.print("*");
		}
		if(a>1) {
			System.out.print("\n");
		}else {
			System.out.print("");
		}
			
	}

}
