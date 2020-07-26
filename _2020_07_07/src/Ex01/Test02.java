package Ex01;

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

public class Test02 {
	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		
		Board board;
		while(true) {
			
			board = new Board();
			System.out.print("제목? ");
			board.title = keyScanner.nextLine();
			System.out.print("내용? ");
			board.contents = keyScanner.nextLine();
			System.out.print("암호? ");
			board.password = keyScanner.nextLine();
			System.out.print("계속 입력하시겠습니까?(y/n)");
			String answer = keyScanner.nextLine();
			if(answer.equals("n"))
				break;
		}
		
		System.out.print(board.no+"   "+board.title+"   "+board.contents+"   "+board.password+"   "+board.createdDate+"   "+board.viewcount);
		keyScanner.close();
	
	}
}
