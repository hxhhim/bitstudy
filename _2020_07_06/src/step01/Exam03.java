package step01;

public class Exam03 {

	static int s1 = 10;
	static int s2 = 20;
	int i1 = 30;
	boolean i2 = true;
	public static void main(String[] args) {
		int l1 = 100;
		int l2 = 200;
		
		Exam03 l3;
		Exam03 l4;
		Exam03 l5;
		
		l3 = new Exam03();
		l5 = l3;
		l4 = new Exam03();
		l3 = new Exam03(); //������ l3�� ��� �ִ� �ּҰ� �����Ǳ� ������ ���� �ν��Ͻ��� �������� �ȴ�. 
							//�������� JVM�� ����� �޸𸮰� �����Ҷ�, JVM�� �Ѱ��Ҷ� �����ȴ�.
							//�׷��� �� �޸� ������ �ٸ� �ν��Ͻ��� ���� ����� �� �ְ� �Ѵ�.
		

	}

}
