package ex_07_01;

import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		int b = sc.nextInt();
		int c = Math.abs(a-b);
		for(int i = 1; i<c; i++) {
			if(a>b) {
				System.out.print(b+i+",");
			}else if(b>a){
				System.out.print(a+i+",");
			}
		}
		sc.close();	
	}

}
