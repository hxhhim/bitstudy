package ex04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner sc = new Scanner(System.in);
		//���۷��� ���� ������ Ŭ������ �ε� �� �ʿ䰡 ����.
		//=> �����ϱ����� User.class
		User user;	//���۷��� ������ �����Ҷ� Ŭ������ �ε����� �ʴ´�.
		
		//1) ����ƽ ������ ����Ҷ� Ŭ������ �ڵ� �ε��ȴ�.
	//	User.count = 100; 

		//2) ����ƽ �޼��带 ȣ���Ҷ� Ŭ������ �ڵ� �ε��ȴ�.
	//	User.increaseCount();

		//3) �ν��Ͻ��� �����Ҷ� Ŭ������ �ڵ� �ε��ȴ�.
	//	user = new User();
		
		//4) Ŭ������ �ε���Ű�� ���� ������ ����Ҷ�.
		Class c = Class.forName("ex04.User");
		user = (User)c.newInstance();
		user.name = "ȫ�浿";
		System.out.println(user.name);
		
	}

}
