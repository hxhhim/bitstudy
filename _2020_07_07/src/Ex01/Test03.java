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

public class Test03 {
	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		
		
		
			Board[] boards = new Board[10];
			int i =0;
			
			Board board;
			while(i<10) {
				board = new Board();
				System.out.print("제목? ");
				board.title = keyScanner.nextLine();
				System.out.print("내용? ");
				board.contents = keyScanner.nextLine();
				System.out.print("암호? ");
				board.password = keyScanner.nextLine();
				
				boards[i] = board; //board[i]를 각각입력받는것보다 board에 받아서 옮기는 편이 더 나은 방식
				i++;
				
				System.out.print("계속 입력하시겠습니까?(y/n)");
				String answer = keyScanner.nextLine();
				if(answer.equals("n"))
					break;
			}
			for(int j=0;j<i;j++) {
				System.out.print(boards[j].no+"   "+boards[j].title+"   "+boards[j].contents+"   "+boards[j].password+"   "+boards[j].createdDate+"   "+boards[j].viewcount);
				System.out.println();
			}
		keyScanner.close();
	
	}
}
