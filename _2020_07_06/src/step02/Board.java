package step02;

public class Board {
	int no;
	String title;
	String contents;
	String writer;
	String createDate;
	int viewCount;
	String passwd;
	static int cnt = 0;
	
	//Ŭ������ �����ڰ� �Ѱ��� ������ �����Ϸ��� ������ ���� �⺻ �����ڸ� �ڵ����� �߰��Ѵ�.
	//public Board(){} ����Ÿ���� ���� Ŭ������ �̸��� ���� �Լ��� �����ڶ�� �Ѵ�.
	//�������� �뵵  = ���ʱ�ȭ
	
	//�⺻ ������(Ư���� �޼���)�� �����Ѵ�.
	//������ Ư���ؼ� 
	//1) ����Ÿ���� ����,
	//2) �޼������ Ŭ���� �̸��� ����.
	//3) �Ķ���Ͱ� ����.
	//�ν��Ͻ� �����Ҷ� �ڵ� ȣ��ȴ�.
	//���� �����ڸ� ������ �ʴ´ٸ� �����Ϸ��� ������ ���� �⺻ �����ڸ� �����.
	//public Board(){}
	
	public Board() {
		System.out.println("Board()");
		no = 1;
		title = "�����Դϴ�.";
		contents = "�����Դϴ�.";
		writer = "ȫ�浿";
		createDate = "2020-07-6";
		passwd = "11111"; 
		cnt++;
	}
	public void test() {
		System.out.println("test()");
	}
}
