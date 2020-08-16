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
	public int getDeleteId(Scanner sc) {
		System.out.println("������ȸ���� id�� �Է����ּ���: ");
		int delId = Integer.parseInt(sc.nextLine());
		return delId;
	}
	public Member getupMember(Scanner sc) {
		System.out.println("������ ȸ�� ������ �Է��ϼ���");
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		
		System.out.print("�ּ�: ");
		String addr = sc.nextLine();
		
		System.out.print("�̸���: ");
		String email = sc.nextLine();
		
		System.out.print("����: ");
		String nation = sc.nextLine();
		
		System.out.print("����: ");
		int age = Integer.parseInt(sc.nextLine());
		
		return new Member(name,addr,nation,email,age);
	}
	public int updateId(Scanner sc) {
		System.out.println("������ ȸ����  id�� �Է����ּ���: ");
		int updateid = Integer.parseInt(sc.nextLine());
		return updateid;
	}
}
