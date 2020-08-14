package ui;

import java.util.Scanner;

import action.Action;
import action.MemberAddAction;
import controller.MemberController;
import svc.MemberListService;

public class MemberUi {

	public static void main(String[] args) {
		boolean isStop = false;
		MemberController memberController = new MemberController();
		MemberListService memberListService = new MemberListService();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("=====회원관리 프로그램=====");
			System.out.println("1. 회원등록");
			System.out.println("2. 회원목록보기");
			System.out.println("3. 회원정보수정");
			System.out.println("4. 회원정보삭제");
			System.out.println("5. 프로그램종료");
			System.out.print("메뉴번호: ");
			int menu = sc.nextInt();
			sc.nextLine();
			Action action = null;
			
			switch(menu) {
			case 1:
				action = new MemberAddAction();
				if(action !=null) {
					memberController.processorRequest(action, sc);
				}
				break;
			case 2:
				memberListService.listMember();
				System.out.println("회원목록보기");
				break;
			case 3:
				System.out.println("회원정보수정");
				break;
			case 4:
				System.out.println("회원정보삭제");
				break;
			case 5:
				System.out.println("프로그램 종료");
				isStop = true;
				break;
			default:
				System.out.println("잘못입력하셨네요.");
				break;
			}
			
		}while(!isStop);

	}

}
