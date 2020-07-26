package Ex07;

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

public class BoardController {
	static Scanner keyScanner ;
	
	BoardDao boardDao = new BoardDao();
	int i =0; //i를 board.cnt로 변경해도 가능
	int j =0;
	String boardName; //게시판마다 이름이 달라야 하기때문에 인스턴스 변수로 따로 관리한다.
	
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
					System.out.println("사용할 수 없는 명령입니다.");
				
				}
			}		
	}
	public void delete() {
		System.out.print("번호?");
		int no = Integer.parseInt(keyScanner.nextLine());//nextInt안쓰는 이유는 엔터가 남아서 다음값을 못넣는경우가 생김
		System.out.print("삭제하시겠습니까?(Y/n)");
		String answer = keyScanner.nextLine();
		if(answer.contentEquals("y")|| answer.contentEquals("")||answer.contentEquals("Y")) {
			int count = boardDao.delete(no-1);
			if(count >0) {
				System.out.println("삭제하였습니다.");
			}else {
				System.out.println("해당게시물이 없음");
			}
		}else {
			System.out.println("삭제 취소하였습니다.");
		}
		
	}
	public void update() {
		
		String select;
		
		System.out.println("번호:");
		int no = Integer.parseInt(keyScanner.nextLine());
				
		if(no < 0 || no >Board.cnt) {
			System.out.println("해당게시물이 없음");
			return;
		}
		Board board =boardDao.selectOne(no-1);
		Board board1 = new Board();
		board1 = board; 
		System.out.printf("제목(%s)?",board.title);
		board1.title = keyScanner.nextLine();
		System.out.printf("내용(%s)?",board.contents);
		board1.contents = keyScanner.nextLine();
		System.out.print("변경하시겠습니까?(y/n)");
		select = keyScanner.nextLine();
		if(select.contentEquals("y")) {
			boardDao.update(board1);
//			boardDao.selectOne(no-1).title =board1.title;
//			boardDao.selectOne(no-1).contents =board1.contents; //시작시 board1에 boards[no-1]값을 넣어주고 시작하고 입력받은후 board[no-1]에 board1을 입력해주어도된다.
			System.out.println("변경하였습니다.");
			
		}
		
		
/*		System.out.println("번호:");
		int no = Integer.parseInt(keyScanner.nextLine());
		
		if(no < 0 || no >i) {
			System.out.println("해당게시물이 없음");
			return;
		}
		Board board = boards[no-1];
		System.out.printf("제목:(%s\n)?",board.title);
		String title =keyScanner.nextLine();
		
		System.out.printf("내용:(%s\n)?",board.contents);
		String contents =keyScanner.nextLine();
		
		System.out.println("변경하시겠습니까?");
		
		board.title = title;
		board.title = contents;
*/		Board.cnt--;
	}
	public void detail() {
		System.out.println("번호:");
		int no = Integer.parseInt(keyScanner.nextLine());
				
		if(no < 0 || no >Board.cnt) {
			System.out.println("해당게시물이 없음");
			return;
		}
		Board board = boardDao.selectOne(no-1);
		System.out.printf("번호: %s\n",board.no);
		System.out.printf("제목: %s\n",board.title);
		System.out.printf("내용: %s\n",board.contents);
		System.out.printf("등록일: %s\n",board.createdDate);
		System.out.printf("조회수: %s\n",board.viewcount);
		
	}
	public void menu() {
		System.out.printf("[메인>%s\n", this.boardName);
		System.out.println("1.상위메뉴로이동(main)");
		System.out.println("2.게시판 글쓰기(add)");
		System.out.println("3.게시판 목록보기(list)");
		System.out.println("4.개인글 보기(detail)");
		System.out.println("5.게시판 글 삭제(delete)");
		System.out.println("6.게시판 글 업데이트(update)");
		System.out.println("메뉴 선택 해주세요:");
	}
	
	public void add() {
		Board board = new Board();
		System.out.print("제목? ");
		board.title = keyScanner.nextLine();
		System.out.print("내용? ");
		board.contents = keyScanner.nextLine();
		System.out.print("암호? ");
		board.password = keyScanner.nextLine();
		boardDao.insert(board);
	}
	static boolean prompt(){
		System.out.print("계속 입력하시겠습니까?(y/n)");
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
