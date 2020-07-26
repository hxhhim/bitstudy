package Ex06;

import java.util.Scanner;

/*
 * 제목? aaaa
 * 내용?	bbbb
 * 암호? 1111
 * ----------------------
 * 1,	aaaa,	bbbb,	1111	2020-07-07, 0
 */
/*하고 싶은거
 * 제목? aaaa
 * 내용?	bbbb
 * 암호? 1111
 * 계속 입력하시겠습니까?(y/n)y
 * 제목? abab
 * 내용?	bcbc
 * 암호? 1111
 * 계속 입력하시겠습니까?(y/n)n
 * 
 * 1,	aaaa,	bbbb,	1111	2020-07-07, 0
 * 2,	abab,	cccc,	2222	2020-07-07, 0
 */

public class BoardController {
	static Scanner keyScanner ;
	
	Board[] boards = new Board[10];
	int i =0;
	int j =0;
	String boardName; //게시판마다 이름이 달라야 하기때문에 인스턴스 변수로 따로 관리한다.
	
	public BoardController(String boardName) {
		this.boardName = boardName;
		
	}
	public  void service() {
									
			while(true) {
				System.out.printf("[메인>%s\n", this.boardName);
				inputBoard();
				if(prompt())
					break;
			}
			System.out.printf("[메인>%s\n", this.boardName);
			for(j=0;j<i;j++) {
				printBoard();
			}		
	}
	public void inputBoard() {
		Board board = new Board();
		
//		System.out.println("[메인>공지게시판]");
		System.out.print("제목? ");
		board.title = keyScanner.nextLine();
		System.out.print("내용? ");
		board.contents = keyScanner.nextLine();
		System.out.print("암호? ");
		board.password = keyScanner.nextLine();
		boards[i++] = board;
	}
	static boolean prompt(){
		System.out.print("계속 입력하시겠습니까?(y/n)");
		String answer = keyScanner.nextLine();
		if(answer.equals("n"))
			return true;
		return false;
	}
	public void printBoard(){
		System.out.printf("%d,%s,%s,%s,%s,%d\n", boards[j].no,boards[j].title,boards[j].contents,boards[j].password,boards[j].createdDate,boards[j].viewcount);
		System.out.println();
	}
}
