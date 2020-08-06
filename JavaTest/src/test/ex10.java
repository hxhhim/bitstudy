package test;

import java.util.Scanner;

/*
 * 사원명함관리 프로그램 더블 링크드 리스트로 구현
 * 사용자로부터 이름(name),부서(dept),전화번호(tel)를 입력받아 메모리에 저장관리한다. 
 * 사원정보를 검색,수정,삭제,출력 기능을 제공한다.
 * 각메뉴 기능
 * 1)input Card
 * 	-name,dept,tel을 입력 받아 링크드 리스트에 삽입
 * 2)search Card
 * -name을 입력받아 명함 정보 검색
 * -이름이 있는 경우 화면에 찾은 정보 출력
 * -이름이 없는 경우 화면에 에러 메시지 출력
 * 3)list Card
 * 모든 명함 정보를 출력
 * 4)modify Cardsdfh23243fgj
 * -name을 입력받아 명함 정보 삭제
 * 5)Delete Card
 * -name을 입력받아 명함 정보 삭제
 * 6)exit
 * -프로그램종료
 */
public class ex10 {
	
	
	public static void main(String[] args) {
		CardController cc = new CardController();
		CardDoubleLinkedList list = new CardDoubleLinkedList();
		
		cc.inputCard();
		cc.inputCard();
		cc.listCard();
//		System.out.println(list.toString());
		
	}
	
	
	
		
	

}
