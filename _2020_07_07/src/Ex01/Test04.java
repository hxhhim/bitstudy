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

public class Test04 {
	public static void main(String[] args) {
		
		//1)Ű���� ��ĳ�� �غ�
		Scanner keyScanner = new Scanner(System.in);
			//�Խù� �ν��Ͻ� �ּҸ� ���� �� ������ ���۷��� �迭�� �ε��� ���� ����
			Board[] boards = new Board[10];
			int i =0;
			
			//�ݺ������� �����ϴ� ������ �ݺ��� �ۿ� ����
			Board board;
			String answer;
			
			//�Խù� ������ �Է� �޴� �ڵ带 �ݺ�����
			while(i<10) {
				//�Խù� ������ ���� �� ���� �ν��Ͻ��� ���۷��� ����
				board = new Board();
				
				//������ �Է¹޾� �ν��Ͻ� ����"title"�� ����
				System.out.print("����? ");
				board.title = keyScanner.nextLine();
				//������ �Է¹޾� �ν��Ͻ� ���� "contents"�� ����
				System.out.print("����? ");
				board.contents = keyScanner.nextLine();
				//��ȣ�� �Է¹޾� �ν��Ͻ� ���� "password"�� ����
				System.out.print("��ȣ? ");
				board.password = keyScanner.nextLine();
				
				//�ν��Ͻ� �ּҸ� ���۷��� �迭�� ���,�ε��� ����
				boards[i] = board; //board[i]�� �����Է¹޴°ͺ��� board�� �޾Ƽ� �ű�� ���� �� ���� ���
				i++;
				
				//��� �Է��� ������ ���°�.
				System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/n)");
				answer = keyScanner.nextLine();
				
				//"n"�� �Է������� �ݺ��� ������.
				if(answer.equals("n"))
					break;
			}
			for(int j=0;j<i;j++) {
//				System.out.print(boards[j].no+"   "+boards[j].title+"   "+boards[j].contents+"   "+boards[j].password+"   "+boards[j].createdDate+"   "+boards[j].viewcount);
				System.out.printf("%d,%s,%s,%s,%s,%d\n", boards[j].no,boards[j].title,boards[j].contents,boards[j].password,boards[j].createdDate,boards[j].viewcount);
				System.out.println();
			}
		keyScanner.close();
	
	}
}
