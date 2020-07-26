package Ex07;

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
	
	BoardDao boardDao = new BoardDao();
	int i =0; //i�� board.cnt�� �����ص� ����
	int j =0;
	String boardName; //�Խ��Ǹ��� �̸��� �޶�� �ϱ⶧���� �ν��Ͻ� ������ ���� �����Ѵ�.
	
	public BoardController(String boardName) {
		this.boardName = boardName;
		
	}
	
	public  void service() {
			String command;
			label1:
			while(true) {
				
				menu();
				command = keyScanner.nextLine();
				switch (command) {
				case "main":
					break label1;
				case "add":
					add();
					break;
				case "detail":
					detail();
					break;
				case "list":
					list();
					break;
				case "update":
					update();
					break;
				case "delete":
					delete();
					break;
				default:
					System.out.println("����� �� ���� ����Դϴ�.");
				
				}
			}		
	}
	public void delete() {
		System.out.print("��ȣ?");
		int no = Integer.parseInt(keyScanner.nextLine());//nextInt�Ⱦ��� ������ ���Ͱ� ���Ƽ� �������� ���ִ°�찡 ����
		System.out.print("�����Ͻðڽ��ϱ�?(Y/n)");
		String answer = keyScanner.nextLine();
		if(answer.contentEquals("y")|| answer.contentEquals("")||answer.contentEquals("Y")) {
			int count = boardDao.delete(no-1);
			if(count >0) {
				System.out.println("�����Ͽ����ϴ�.");
			}else {
				System.out.println("�ش�Խù��� ����");
			}
		}else {
			System.out.println("���� ����Ͽ����ϴ�.");
		}
		
	}
	public void update() {
		
		String select;
		
		System.out.println("��ȣ:");
		int no = Integer.parseInt(keyScanner.nextLine());
				
		if(no < 0 || no >Board.cnt) {
			System.out.println("�ش�Խù��� ����");
			return;
		}
		Board board =boardDao.selectOne(no-1);
		Board board1 = new Board();
		board1 = board; 
		System.out.printf("����(%s)?",board.title);
		board1.title = keyScanner.nextLine();
		System.out.printf("����(%s)?",board.contents);
		board1.contents = keyScanner.nextLine();
		System.out.print("�����Ͻðڽ��ϱ�?(y/n)");
		select = keyScanner.nextLine();
		if(select.contentEquals("y")) {
			boardDao.update(board1);
//			boardDao.selectOne(no-1).title =board1.title;
//			boardDao.selectOne(no-1).contents =board1.contents; //���۽� board1�� boards[no-1]���� �־��ְ� �����ϰ� �Է¹����� board[no-1]�� board1�� �Է����־�ȴ�.
			System.out.println("�����Ͽ����ϴ�.");
			
		}
		
		
/*		System.out.println("��ȣ:");
		int no = Integer.parseInt(keyScanner.nextLine());
		
		if(no < 0 || no >i) {
			System.out.println("�ش�Խù��� ����");
			return;
		}
		Board board = boards[no-1];
		System.out.printf("����:(%s\n)?",board.title);
		String title =keyScanner.nextLine();
		
		System.out.printf("����:(%s\n)?",board.contents);
		String contents =keyScanner.nextLine();
		
		System.out.println("�����Ͻðڽ��ϱ�?");
		
		board.title = title;
		board.title = contents;
*/		Board.cnt--;
	}
	public void detail() {
		System.out.println("��ȣ:");
		int no = Integer.parseInt(keyScanner.nextLine());
				
		if(no < 0 || no >Board.cnt) {
			System.out.println("�ش�Խù��� ����");
			return;
		}
		Board board = boardDao.selectOne(no-1);
		System.out.printf("��ȣ: %s\n",board.no);
		System.out.printf("����: %s\n",board.title);
		System.out.printf("����: %s\n",board.contents);
		System.out.printf("�����: %s\n",board.createdDate);
		System.out.printf("��ȸ��: %s\n",board.viewcount);
		
	}
	public void menu() {
		System.out.printf("[����>%s\n", this.boardName);
		System.out.println("1.�����޴����̵�(main)");
		System.out.println("2.�Խ��� �۾���(add)");
		System.out.println("3.�Խ��� ��Ϻ���(list)");
		System.out.println("4.���α� ����(detail)");
		System.out.println("5.�Խ��� �� ����(delete)");
		System.out.println("6.�Խ��� �� ������Ʈ(update)");
		System.out.println("�޴� ���� ���ּ���:");
	}
	
	public void add() {
		Board board = new Board();
		System.out.print("����? ");
		board.title = keyScanner.nextLine();
		System.out.print("����? ");
		board.contents = keyScanner.nextLine();
		System.out.print("��ȣ? ");
		board.password = keyScanner.nextLine();
		boardDao.insert(board);
	}
	static boolean prompt(){
		System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/n)");
		String answer = keyScanner.nextLine();
		if(answer.equals("n"))
			return true;
		return false;
	}
	public void list(){
		Board[] boards = boardDao.selectList();
		
		for(int x = 0; x<boards.length;x++) {
		System.out.printf("%d,%s,%s,%s,%s,%d\n", boards[x].no,boards[x].title,boards[x].contents,boards[x].password,boards[x].createdDate,boards[x].viewcount);
		System.out.println();
	}
	}
}
