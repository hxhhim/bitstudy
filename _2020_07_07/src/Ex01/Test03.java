package Ex01;

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

public class Test03 {
	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		
		
		
			Board[] boards = new Board[10];
			int i =0;
			
			Board board;
			while(i<10) {
				board = new Board();
				System.out.print("����? ");
				board.title = keyScanner.nextLine();
				System.out.print("����? ");
				board.contents = keyScanner.nextLine();
				System.out.print("��ȣ? ");
				board.password = keyScanner.nextLine();
				
				boards[i] = board; //board[i]�� �����Է¹޴°ͺ��� board�� �޾Ƽ� �ű�� ���� �� ���� ���
				i++;
				
				System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/n)");
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
