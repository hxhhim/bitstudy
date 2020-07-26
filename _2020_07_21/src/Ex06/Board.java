package Ex06;

import java.io.Serializable;
import java.sql.Date;

public class Board implements Serializable{
	int no;
	String title;
	String contents;
	String writer;
	String createdDate;
	int viewCount;
	String password;
	
	public Board() {
		this.no =1;
		this.title = "제목입니다.";
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.createdDate = str;
		this.password = "1111";
	}
	public Board(String title,String contents, String password) {
		this();
		this.title = title;
		this.contents = contents;
		this.password = password;
	}
}
/*
 *역활: 게시물 데이터를 보관
 *뭔가 데이터를 보관하는 역활자를 "값 객체(VO;value Object)"라 부른다.
 *=>다른말로 "(비지니스)도메인 객체(Domain Object)"라 부른다.
 *=>또다른 말로 "데이터 전송용으로 사용하는 객체(DTO;Data Transfer Object)"라 부른다.
 *=>용어정리 :VO==DTO==도메인 객체 
 */
