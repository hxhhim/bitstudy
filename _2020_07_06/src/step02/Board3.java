package step02;

public class Board3 {
	int no;
	String title;
	String contents;
	String writer;
	String createDate;
	int viewCount;
	String passwd;
	public Board3() {
		System.out.println("Board3() ������ ȣ���");
		//�����ڵ� ���庯�� this �� �ִ�.
		//this�� ���� ������ �ν��Ͻ� �ּҸ� ���� �ִ�.
		this.no = 1;
		this.title = "�����Դϴ�.";
		//���� ��¥�� ���ڿ��� ��� ���
		//1)���� ��¥�� ����ִ� �ν��Ͻ��غ�
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		//2) toString() ������ : �ν��Ͻ����� ��¥ ������ �ǾƼ� ���ڿ��� �ٲ۴�.
		String str = today.toString();
		this.createDate = str;
		this.viewCount = 0;
		this.passwd = "1111";
	}
	void nshow() {
		System.out.println("no: "+this.no); 
	}
	void set(int no) {
		this.no = no;
	}
}
