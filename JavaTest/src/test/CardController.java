package test;

import java.util.Scanner;

public class CardController {
	CardDoubleLinkedList list = new CardDoubleLinkedList();
	Scanner sc = new Scanner(System.in);
	
	public void inputCard() {
		System.out.println("�̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		System.out.println("�μ���  �Է��ϼ���.");
		String dept = sc.nextLine();
		System.out.println("��ȭ��ȣ��  �Է��ϼ���.");
		String tel = sc.nextLine();
		Card card = new Card(name,dept,tel);
		list.addFirst(card);
		
	}
	public void searchCard() {
		
	}
	public void listCard() {
		 
			System.out.println(list);
		}	
}
