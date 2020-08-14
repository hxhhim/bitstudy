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
			System.out.println("=====ȸ������ ���α׷�=====");
			System.out.println("1. ȸ�����");
			System.out.println("2. ȸ����Ϻ���");
			System.out.println("3. ȸ����������");
			System.out.println("4. ȸ����������");
			System.out.println("5. ���α׷�����");
			System.out.print("�޴���ȣ: ");
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
				System.out.println("ȸ����Ϻ���");
				break;
			case 3:
				System.out.println("ȸ����������");
				break;
			case 4:
				System.out.println("ȸ����������");
				break;
			case 5:
				System.out.println("���α׷� ����");
				isStop = true;
				break;
			default:
				System.out.println("�߸��Է��ϼ̳׿�.");
				break;
			}
			
		}while(!isStop);

	}

}
