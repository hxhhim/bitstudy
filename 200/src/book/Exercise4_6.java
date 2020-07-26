package book;

import java.util.Scanner;

public class Exercise4_6 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance =0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1. 예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			String menu = scanner.nextLine();
			int num = 0;
			switch(menu) {
				case "1":
					num = 0;
					System.out.print("예금액>");
					num = Integer.parseInt(scanner.nextLine());
					sum += num;
					break;
				case "2":
					num = 0;
					System.out.print("출금액>");
					num = Integer.parseInt(scanner.nextLine());
					sum -= num;
					break;
				case "3":
					System.out.println("잔고>"+sum);
					break;
				case "4":
					run = false;
					break;
								
			}
		
	    }
		System.out.println("프로그램 종료");
	}
}
