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

public class Test02 {
	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		
		Board board;
		while(true) {
			
			board = new Board();
			System.out.print("����? ");
			board.title = keyScanner.nextLine();
			System.out.print("����? ");
			board.contents = keyScanner.nextLine();
			System.out.print("��ȣ? ");
			board.password = keyScanner.nextLine();
			System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/n)");
			String answer = keyScanner.nextLine();
			if(answer.equals("n"))
				break;
		}
		
		System.out.print(board.no+"   "+board.title+"   "+board.contents+"   "+board.password+"   "+board.createdDate+"   "+board.viewcount);
		keyScanner.close();
	
	}
}
