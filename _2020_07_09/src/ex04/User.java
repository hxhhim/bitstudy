package ex04;

public class User {
	static int count;
	String name;
	String email;
	String password;
	
	static {	//����ƽ ���:Ŭ������ �ε��� �� �ڵ����� ����Ǵ� ���
		System.out.println("User Ŭ���� �ε�");
	}
	static void increaseCount() {
		count++;//���� Ŭ������ �Ҽӵ� ���,
				//����ƽ ������ �޼��带 ����Ҷ� Ŭ���� �̸� ���� ����
	}
}

