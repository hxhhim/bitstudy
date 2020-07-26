package Ex05;

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

public class BoardController3 {
	static Scanner keyScanner ;
	public static void service() {
		
		
			Board[] boards = new Board[10];
			int i =0;
						
			Board board;
			String answer;
						
			while(i<10) {
				boards[i] = inputBoard();
				i++;
				
				if(prompt())
					break;
			}
			
			for(int j=0;j<i;j++) {
				printBoard(boards[j]);
				
			}
		
	
	}
	static Board inputBoard() {
		Board board = new Board();
		
		System.out.println("[메인>개발부게시판]");
		System.out.print("제목? ");
		board.title = keyScanner.nextLine();
		System.out.print("내용? ");
		board.contents = keyScanner.nextLine();
		System.out.print("암호? ");
		board.password = keyScanner.nextLine();
		return board;
	}
	static boolean prompt(){
		System.out.print("계속 입력하시겠습니까?(y/n)");
		String answer = keyScanner.nextLine();
				
		if(answer.equals("n"))
			return true;
		return false;
	}
	static void printBoard(Board board){
		System.out.printf("%d,%s,%s,%s,%s,%d\n", board.no,board.title,board.contents,board.password,board.createdDate,board.viewcount);
		System.out.println();
	}
}
