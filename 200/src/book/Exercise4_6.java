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
			System.out.println("1. ���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------");
			System.out.print("����> ");
			String menu = scanner.nextLine();
			int num = 0;
			switch(menu) {
				case "1":
					num = 0;
					System.out.print("���ݾ�>");
					num = Integer.parseInt(scanner.nextLine());
					sum += num;
					break;
				case "2":
					num = 0;
					System.out.print("��ݾ�>");
					num = Integer.parseInt(scanner.nextLine());
					sum -= num;
					break;
				case "3":
					System.out.println("�ܰ�>"+sum);
					break;
				case "4":
					run = false;
					break;
								
			}
		
	    }
		System.out.println("���α׷� ����");
	}
}
