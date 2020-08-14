package util;

import java.util.Scanner;

import vo.Member;

public class ConsoleUtil {
	public Member getNewMember(Scanner sc) {
		System.out.println("등록할 회원 정보를 입력하세요");
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("주소: ");
		String addr = sc.nextLine();
		
		System.out.print("이메일: ");
		String email = sc.nextLine();
		
		System.out.print("국가: ");
		String nation = sc.nextLine();
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		return new Member(name,addr,nation,email,age);
	}
}
