package Ex05;

import java.util.Scanner;

/*
 * [메뉴]
 * 1.게시판
 * 2.연락처
 * 0.종료
 * ----------
 * 메뉴 번호를 입력하세요.>1
 * [메인>게시판]
 * 제목?aaa
 * 내용?bbb
 * 암호?1111
 * 계속 입력하겠습니까?(y/n)n
 * [메인>게시판]
 * 1.aaaa , bbb,1111,2020-07-07,0
 * 메뉴번호를 입력하세요>2
 * [메인>연락처]
 * 이름?홍길동
 * 전화?1111
 * 이메일?hong@test.com
 * 회사? 비트 캠프
 * 직위? 대리
 *  계속 입력하겠습니까?(y/n)n
 *  [메뉴>연락처]
 *  홍길동,1111,hong@test.com,비트캠프,대리
 
 *  
 * [메뉴]
 * 		1.게시판
 * 		2.연락처
 * 		0.종료
 * ------------------------
 * 메뉴번호를 입력하세요>1
 * 게시판
 *[메뉴]
 * 		1.게시판
 * 		2.연락처
 * 		0.종료
 * ------------------------
 *메뉴번호를 입력하세요>2
 *연락처
 * [메뉴]
 * 		1.게시판
 * 		2.연락처
 * 		0.종료
 * ------------------------
 *메뉴번호를 입력하세요>3
 *해당메뉴가 없습니다.
 ** [메뉴]
 * 		1.게시판
 * 		2.연락처
 * 		0.종료
 * ------------------------

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
		BoardController2.keyScanner = keyScanner;
		BoardController3.keyScanner = keyScanner;
		label1:
		while(true) {
		System.out.println("-------------------------");
		System.out.println("[메뉴]");
		System.out.println("1.공지 게시판");
		System.out.println("2.영업부게시판");
		System.out.println("3.개발부게시판");
		System.out.println("4.연락처");
		System.out.println("0.종료");
		System.out.println("-------------------------");
		System.out.println("메뉴 번호를 입력하세요>");
		String menuNo = keyScanner.nextLine();
		
		switch(menuNo) {
		case "1":
			BoardController.service();
			break;
		case "2":
			BoardController2.service();
			break;
		case "3":
			BoardController3.service();
			break;
		case "4":
			ContactController.service();
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
