package book;

import java.util.Scanner;

public class DowhileExample {

	public static void main(String[] args) {
		System.out.println("�޼����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷�����");

	}

}