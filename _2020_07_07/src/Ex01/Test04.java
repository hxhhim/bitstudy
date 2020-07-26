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

public class Test04 {
	public static void main(String[] args) {
		
		//1)키보드 스캐너 준비
		Scanner keyScanner = new Scanner(System.in);
			//게시물 인스턴스 주소를 여러 개 저장할 레퍼런스 배열과 인덱스 변수 선언
			Board[] boards = new Board[10];
			int i =0;
			
			//반복문에서 생성하는 변수를 반복문 밖에 선언
			Board board;
			String answer;
			
			//게시물 정보를 입력 받는 코드를 반복실행
			while(i<10) {
				//게시물 정보를 담을 한 개의 인스턴스와 레퍼런스 선언
				board = new Board();
				
				//제목을 입력받아 인스턴스 변수"title"에 저장
				System.out.print("제목? ");
				board.title = keyScanner.nextLine();
				//내용을 입력받아 인스턴스 변수 "contents"에 저장
				System.out.print("내용? ");
				board.contents = keyScanner.nextLine();
				//압호를 입력받아 인스턴스 변수 "password"에 저장
				System.out.print("암호? ");
				board.password = keyScanner.nextLine();
				
				//인스턴스 주소를 레퍼런스 배열에 백업,인덱스 증가
				boards[i] = board; //board[i]를 각각입력받는것보다 board에 받아서 옮기는 편이 더 나은 방식
				i++;
				
				//계속 입력할 것인지 묻는것.
				System.out.print("계속 입력하시겠습니까?(y/n)");
				answer = keyScanner.nextLine();
				
				//"n"을 입력했을때 반복문 나간다.
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
