package step02;

public class Board6 {
	int no;
	String title;
	String contents;
	String writer;
	String createDate;
	int viewCount;
	String passwd;
	
	public Board6() {
		this("����","����","ȫ�浿");
		this.no = 1;
		
	}
	public Board6(String title, String contents, String writer) {
		//�ٸ� �����ڸ� ȣ���Ҷ�
		//=>this(�Ķ����,...);
		//=>�ݵ�� ù��° �������� �;� �Ѵ�.
	//	this();//�⺻ �����ڸ� ȣ���Ͽ� �⺻ �۾��� �����Ѵ�.
		System.out.println("Board6(String,String,String) ������ ȣ���");
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		
			
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
