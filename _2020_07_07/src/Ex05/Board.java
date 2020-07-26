package Ex05;

import java.sql.Date;

// 1,	aaaa,	bbbb,	1111	2020-07-07, 0
public class Board {
	static int cnt =0; //board 배열로 입력할때 자동 카운트 되어 no 값을 변경하기 위해서
	int no;
	String title;
	String contents;
	String password;
	String createdDate;
	int viewcount;
	
	public Board() {
		cnt++;
		this.no =cnt;
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.createdDate = str;
		viewcount = 0;
	}
	
}
