/*
 * ����?  aaaa
 * ����?  bbbb
 * ��ȣ?  1111
 * ------------------------------
 * 1,  aaaa,  bbbb,  1111,  2020-07-07,  0
 */

/*�ϰ������ 
 * ����?  aaaa
 * ����?  bbbb
 * ��ȣ?  1111
 * ��� �Է��Ͻðڽ��ϱ�?(y/n)y
 * ����?  abab
 * ����?  cccc
 * ��ȣ?  2222
 * ��� �Է��Ͻðڽ��ϱ�?(y/n)n
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
	String boardName;  //�Խ��Ǹ��� �̸��� �޶�� �ϱ� ������ �ν��Ͻ� ������ 
	                   //���� �����Ѵ�.
	
	public BoardController(String boardName) {
		this.boardName = boardName;
	}
	
	public void service() {
	
		while(true) {
			//�Խù� ������ ���� �� ���� �ν��Ͻ��� ���۷��� ���� 
			System.out.printf("[���� > %s\n", this.boardName);
			inputBoard(); 
			if(prompt())
			   break;
		}
		System.out.printf("[���� > %s\n", this.boardName);
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
		//��� �Է��� ������ ���°� 
		System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/n) ");
		String answer = keyScanner.nextLine();
		
		//"n"�� �Է����� �� �ݺ��� ������.
		if(answer.equals("n"))
			return true;
		return false;
	}
	
	public void inputBoard() {
		Board board = new Board();
		System.out.println("[���� > �Խ���]");
		//������ �Է� �޾� �ν��Ͻ� ���� "title"�� ���� 
		System.out.print("����? ");
		board.title = keyScanner.nextLine();
		
		//������ �Է� �޾� �ν��Ͻ� ���� "contents"�� ����
		System.out.print("����? ");
		board.contents = keyScanner.nextLine();
		
		//��ȣ�� �Է� �޾� �ν��Ͻ� ���� "password"�� ����
		System.out.print("��ȣ? ");
		board.password = keyScanner.nextLine();
		boards[i++] = board;
	}
}
