package Ex06;

import java.util.Scanner;

/*
 *메인 >1
 *메인/공지 게시판>list
 * 1, aaa,bbb,1111,2020-07-08 ,0
 * 2, ccc,bbb,1111,2020-07-08 ,0
 * 3, ddd,ccc,1111,2020-07-08 ,0
 * 메인/공지게시판>add
 * 제목? ####
 * 내용? @@
 * 암호? ####
 * 저장하시겠습니까?(y/n) y
 * 저장하였습니다.
 * 메인/공지게시판>detail
 * 번호?1
 * 제목: aaa
 * 내용: bbb
 * 등록일:2020-07-08
 * 조회수:0
 * 메인/공지게시판>delete
 * 번호?2
 * 정말 삭제하시겠습니까?(y/n)y
 * 삭제하였습니다.
 * 메인/공지게시판>list
 * 1, aaa,bbb,1111,2020-07-08 ,0
 * 3, ddd,ccc,1111,2020-07-08 ,0
 * 메인/공지게시판>update
 * 번호?1
 * 제목(aaa)?####
 * 내용(bbb)?###
 * 변경하시겠습니까?(y/n)y
 * 변경하였습니다.
 * 메인/공지게시판>list
 * 1, ####,###,1111,2020-07-08 ,0
 * 3, ddd,ccc,1111,2020-07-08 ,0
 * 메인/공지게시판>main
 * (실행을 종료하고 메인화면으로 이동)
 * 
 */
public class MainApp {

	public static void main(String[] args) {
/*		Scanner str = new Scanner(System.in);
		
		int menu;
		while(menu!=0)
		System.out.println("[메뉴]");
		System.out.println(" 1.게시판");
		System.out.println(" 2.연락처");
		System.out.println(" 0.종료");
		System.out.println("------------");
		System.out.println("메뉴번호를 입력하세요>");
		menu = str.nextInt();
		if(menu==1)
			System.out.println("게시판");
		else if(menu==2)
			System.out.println("연락처");
		else 
			System.out.println("해당메뉴가 없습니다.");
*/		
		Scanner keyScanner = new Scanner(System.in);
		BoardController.keyScanner = keyScanner;
		ContactController.keyScanner = keyScanner;
//		BoardController2.keyScanner = keyScanner;
//		BoardController3.keyScanner = keyScanner;
		BoardController board1 = new BoardController("공지게시판");
		BoardController board2 = new BoardController("영업부시판");
		BoardController board3 = new BoardController("개발게시판");
		ContactController contact1 = new ContactController("직원연락처");
		ContactController contact2 = new ContactController("고객연락처");
		
		label1:
		while(true) {
		System.out.println("-------------------------");
		System.out.println("[메뉴]");
		System.out.println("1.공지 게시판");
		System.out.println("2.영업부게시판");
		System.out.println("3.개발부게시판");
		System.out.println("4.직원연락처");
		System.out.println("5.고객연락처");
		System.out.println("0.종료");
		System.out.println("-------------------------");
		System.out.println("메뉴 번호를 입력하세요>");
		String menuNo = keyScanner.nextLine();
		
		switch(menuNo) {
		case "1":
			board1.service();
			break;
		case "2":
			board2.service();
			break;
		case "3":
			board3.service();
			break;
		case "4":
			contact1.service();
			break;
		case "5":
			contact2.service();
			break;
		case "0":
			break label1;
		default:
			System.out.println("해당메뉴가 없습니다.");
		}
		}
		keyScanner.close();
	}
	
}
