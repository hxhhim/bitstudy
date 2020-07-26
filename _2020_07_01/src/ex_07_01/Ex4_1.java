package ex_07_01;

import java.util.Scanner;

public class Ex4_1 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		int retry;
		do {
			System.out.print("정수값");
			int n = stdln.nextInt();
			
			if(n>0)
				System.out.println("값이 양수 입니다.");
			else if(n<0)
				System.out.println("값이 음수 입니다.");
			else
				System.out.println("값이 0 입니다.");
			System.out.println("다시 한번? 1-Yes/0-No:");
				retry = stdln.nextInt();
		}while(retry==1);
		}
		
		
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 반복횟수를 입력하세요:");
		int b = sc.nextInt();
		for(int i=0;i<b;i++) {
			System.out.println("정수를 입력하세요:");
			int a = sc.nextInt();
			if(a>0) {
				System.out.println("입력한 정수는 양수입니다.");
			}else if(a<0) {
				System.out.println("입력한 정수는 음수입니다");
			}else {
				System.out.println("입력한 정수는 0입니다 .");
			
		}
	}
		System.out.println("완료되었습니다.");
		sc.close();
*/	}


