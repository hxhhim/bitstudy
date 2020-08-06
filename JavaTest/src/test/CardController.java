package test;

import java.util.Scanner;

public class CardController {
	CardDoubleLinkedList list = new CardDoubleLinkedList();
	Scanner sc = new Scanner(System.in);
	
	public void inputCard() {
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("부서를  입력하세요.");
		String dept = sc.nextLine();
		System.out.println("전화번호를  입력하세요.");
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
