package Ex016;
/*
 * [메뉴]
 * 1. 게시판
 * 2. 연락처
 * 0. 종료
 * ----------------------------
 * 메뉴 번호를 입력하세요>1
 * [메인 > 게시판]
 * 제목? aaa
 * 내용? bbb
 * 암호? 1111
 * 계속 입력하시겠습니까?(y/n)n
 * [메인 > 게시판]
 * 1, aaa, bbb, 1111, 2020-07-07, 0
 * 메뉴 번호를 입력하세요> 2
 * [메인 > 연락처]
 * 이름? 홍길동
 * 전화? 111
 * 이메일? hong@test.com
 * 회사? 비트캠프
 * 직위? 대리
 * 계속 입력하시겠습니까?(y/n)n
 * [메인 > 연락처]
 * 홍길동, 111, hong@test.com, 비트 캠프, 대리 
 */

import java.util.Scanner;

/*
[메뉴]
* 1. 게시판
* 2. 연락처
* 0. 종료
--------------------------
메뉴 번호를 입력하세요> 1
게시판 
[메뉴]
* 1. 게시판
* 2. 연락처
* 0. 종료
--------------------------
메뉴 번호를 입력하세요> 2
연락처
[메뉴]
* 1. 게시판
* 2. 연락처
* 0. 종료
--------------------------
메뉴 번호를 입력하세요> 3
해당 메뉴가 없습니다.
[메뉴]
* 1. 게시판
* 2. 연락처
* 0. 종료
--------------------------
메뉴 번호를 입력하세요> 
*/

public class MainApp {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		BoardController.keyScanner = keyScanner;
	//	BoardController2.keyScanner = keyScanner;
	//	BoardController3.keyScanner = keyScanner;
		BoardController board1 = new BoardController("공지 게시판");
		BoardController board2 = new BoardController("영업부 게시판");
		BoardController board3 = new BoardController("개발 게시판");
		
		lable1:
		while(true) {
			System.out.println("------------------------------");
			System.out.println("[메뉴]");
			System.out.println("1. 공지 게시판");
			System.out.println("2. 영업부 게시판 ");
			System.out.println("3. 개발부 게시판");
			System.out.println("4. 연락처");
			System.out.println("0. 종료");
			System.out.println("-------------------------------");
			System.out.print("메뉴 번호를 입력 하세요> ");
			String menuNo = keyScanner.nextLine();
		
			switch(menuNo) {
			case "1":
				//System.out.println("게시판");
				board1.service();
				break;
			case "2":
				//System.out.println("연락처");
				board2.service();
				break;
			case "3":
				board3.service();
			case "0":
				break lable1;
			default:
				System.out.println("해당 메뉴가 없습니다.");
			}
		}
		keyScanner.close();
	}
	
}













