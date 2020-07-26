/*
 * 제목?  aaaa
 * 내용?  bbbb
 * 암호?  1111
 * ------------------------------
 * 1,  aaaa,  bbbb,  1111,  2020-07-07,  0
 */

/*하고싶은거 
 * 제목?  aaaa
 * 내용?  bbbb
 * 암호?  1111
 * 계속 입력하시겠습니까?(y/n)y
 * 제목?  abab
 * 내용?  cccc
 * 암호?  2222
 * 계속 입력하시겠습니까?(y/n)n
 * 
 * 1,  aaaa,  bbbb,  1111,  2020-07-07,  0
 * 2,  abab,  cccc,  2222,  2020-07-07,  0
 */

package Ex016;

import java.util.Scanner;

public class BoardController {
	static Scanner keyScanner;
	
	Board[] boards = new Board[10];
	int i = 0;
	int j = 0;
	String boardName;  //게시판마다 이름이 달라야 하기 때문에 인스턴스 변수로 
	                   //따로 관리한다.
	
	public BoardController(String boardName) {
		this.boardName = boardName;
	}
	
	public void service() {
	
		while(true) {
			//게시물 정보를 담을 한 개의 인스턴스와 레퍼런스 선언 
			System.out.printf("[메인 > %s\n", this.boardName);
			inputBoard(); 
			if(prompt())
			   break;
		}
		System.out.printf("[메인 > %s\n", this.boardName);
		for(j=0;j<i;j++) {
			printBoard();
		}
	}
	public void printBoard(){
		System.out.printf("%d, %s, %s, %s, %s %d\n",
				boards[j].no, boards[j].title ,boards[j].contents, 
			    boards[j].password,boards[j].createdDate,
		        boards[j].viewCount);
	}
	static boolean prompt(){
		//계속 입력할 것인지 묻는것 
		System.out.print("계속 입력하시겠습니까?(y/n) ");
		String answer = keyScanner.nextLine();
		
		//"n"을 입력했을 때 반복분 나간다.
		if(answer.equals("n"))
			return true;
		return false;
	}
	
	public void inputBoard() {
		Board board = new Board();
		System.out.println("[메인 > 게시판]");
		//제목을 입력 받아 인스턴스 변수 "title"에 저장 
		System.out.print("제목? ");
		board.title = keyScanner.nextLine();
		
		//내용을 입력 받아 인스턴스 변수 "contents"에 저장
		System.out.print("내용? ");
		board.contents = keyScanner.nextLine();
		
		//암호을 입력 받아 인스턴스 변수 "password"에 저장
		System.out.print("암호? ");
		board.password = keyScanner.nextLine();
		boards[i++] = board;
	}
}
