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
		this.title = "�����Դϴ�.";
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
 *��Ȱ: �Խù� �����͸� ����
 *���� �����͸� �����ϴ� ��Ȱ�ڸ� "�� ��ü(VO;value Object)"�� �θ���.
 *=>�ٸ����� "(�����Ͻ�)������ ��ü(Domain Object)"�� �θ���.
 *=>�Ǵٸ� ���� "������ ���ۿ����� ����ϴ� ��ü(DTO;Data Transfer Object)"�� �θ���.
 *=>������� :VO==DTO==������ ��ü 
 */