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
		this("제목","내용","홍길동");
		this.no = 1;
		
	}
	public Board6(String title, String contents, String writer) {
		//다른 생성자를 호출할때
		//=>this(파라미터,...);
		//=>반드시 첫번째 문장으로 와야 한다.
	//	this();//기본 생성자를 호출하여 기본 작업을 수행한다.
		System.out.println("Board6(String,String,String) 생성자 호출된");
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		
			
	}
	
	//"인스턴스 메서드"라 부른다.=> 인스턴스 값을 사용하여 작업을 수행하는 메서드.
	//"연산자"라 부른다. => Board4 타입의 데이터를 다룰 수 있는 연사자로서 역활
	//"메시지"라 부른다. => Board4 객체에 전달하는 메시지(명령어). 
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
