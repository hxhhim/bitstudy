package Ex05;

import java.util.Scanner;

/*
 * ����? aaaa
 * ����?	bbbb
 * ��ȣ? 1111
 * ----------------------
 * 1,	aaaa,	bbbb,	1111	2020-07-07, 0
 */
/*�ϰ� ������
 * ����? aaaa
 * ����?	bbbb
 * ��ȣ? 1111
 * ��� �Է��Ͻðڽ��ϱ�?(y/n)y
 * ����? abab
 * ����?	bcbc
 * ��ȣ? 1111
 * ��� �Է��Ͻðڽ��ϱ�?(y/n)n
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
		
		System.out.println("[����>���ߺΰԽ���]");
		System.out.print("����? ");
		board.title = keyScanner.nextLine();
		System.out.print("����? ");
		board.contents = keyScanner.nextLine();
		System.out.print("��ȣ? ");
		board.password = keyScanner.nextLine();
		return board;
	}
	static boolean prompt(){
		System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/n)");
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
