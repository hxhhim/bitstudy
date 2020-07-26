package ex_07_01;

import java.util.Scanner;

public class ex4_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			if(i%2!=0) {
				System.out.print("+");
			}else
				System.out.print("*");
				
		}System.out.println();
		System.out.println("-----끝-----");
	}

}
