package Ex06;

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

public class BoardController {
	static Scanner keyScanner ;
	
	Board[] boards = new Board[10];
	int i =0;
	int j =0;
	String boardName; //�Խ��Ǹ��� �̸��� �޶�� �ϱ⶧���� �ν��Ͻ� ������ ���� �����Ѵ�.
	
	public BoardController(String boardName) {
		this.boardName = boardName;
		
	}
	public  void service() {
									
			while(true) {
				System.out.printf("[����>%s\n", this.boardName);
				inputBoard();
				if(prompt())
					break;
			}
			System.out.printf("[����>%s\n", this.boardName);
			for(j=0;j<i;j++) {
				printBoard();
			}		
	}
	public void inputBoard() {
		Board board = new Board();
		
//		System.out.println("[����>�����Խ���]");
		System.out.print("����? ");
		board.title = keyScanner.nextLine();
		System.out.print("����? ");
		board.contents = keyScanner.nextLine();
		System.out.print("��ȣ? ");
		board.password = keyScanner.nextLine();
		boards[i++] = board;
	}
	static boolean prompt(){
		System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/n)");
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
