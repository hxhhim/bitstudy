package util;

import java.util.Scanner;

import vo.Member;

public class ConsoleUtil {
	public Member getNewMember(Scanner sc) {
		System.out.println("����� ȸ�� ������ �Է��ϼ���");
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		
		System.out.print("�ּ�: ");
		String addr = sc.nextLine();
		
		System.out.print("�̸���: ");
		String email = sc.nextLine();
		
		System.out.print("����: ");
		String nation = sc.nextLine();
		
		System.out.print("����: ");
		int age = sc.nextInt();
		
		return new Member(name,addr,nation,email,age);
	}
}
