package step02;

import java.sql.Date;

public class Board4 {
	int no;
	String title;
	String contents;
	String writer;
	String createDate;
	int viewCount;
	String passwd;
	public Board4() {
		System.out.println("Board4() ������ ȣ���");
		this.no = 1;
		this.title = "�����Դϴ�.";
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.createDate = str;
		this.viewCount = 0;
		this.passwd = "1111";
		
	}
	public Board4(String title, String contents, String writer) {
		System.out.println("Board4(String, String,String)������ ȣ���");
		this.no = 1;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.createDate = str;
		this.viewCount = 0;
		this.passwd = "1111"; 
			
	}
	//"�ν��Ͻ� �޼���"�� �θ���.=> �ν��Ͻ� ���� ����Ͽ� �۾��� �����ϴ� �޼���.
	//"������"�� �θ���. => Board4 Ÿ���� �����͸� �ٷ� �� �ִ� �����ڷμ� ��Ȱ
	//"�޽���"�� �θ���. => Board4 ��ü�� �����ϴ� �޽���(��ɾ�). 
	public void printInfo() {
		System.out.println(no);
		System.out.println(title);
		System.out.println(contents);
		System.out.println(writer);
		System.out.println(createDate);
		System.out.println(viewCount);
		System.out.println(passwd);
	}

}
