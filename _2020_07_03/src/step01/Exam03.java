package step01;

public class Exam03 {
	//1)���� �ް� �����ϴ� �޼���
	//=> �Ķ����(parameter): �ܺο��� �Է��� ���� �޴� ����
	// 	int func(int a, int b){}  ��)a,b
	//=> �ƱԸ�Ʈ(argument):�޼��带 ����� �� (ȣ���Ҷ�)�����ϴ� ��
	//  int result = func(10,20);  ��)10,20
	//=>����Ÿ�� : �޼��带 �������� �����ϴ� ���� ������ Ÿ��.
	//  int func(float a, float b){}  ��)int
	
	static int m1(int a, int b) {
		return a+b; //���� �����Ҷ� return ����� ����Ѵ�.
	}
	
	//2)���� �ް� ����� �������� �ʴ� �޼���
	static void m2(int a, int b) {
		if(b==0) {
			return;// �׳�  return�� ����ϸ�, �Լ� ������ ��� ���߰� ȣ���� ������ ����.
		}
		System.out.println(a/b);
	}
	//3)���� ���� �ʰ� ����� �����ϴ� �޼���
	static int m3() { //���� ���� �ʴ´ٰ� void�� �����ؼ��� �ȵȴ�.
		return 100; //int Ÿ���� ���� �����ϱ�� ������ �ݵ�� ��Ÿ���� ���� �����ؾ� �Ѵ�.
	}
	//4) ���� �ȹް� ����� �������� �ʴ� �޼���
	static void m4() {
		System.out.println("?????");
	}
	static void fm() {
		System.out.println("fm()");
	}
	static void fm(int a) {
		System.out.println(a);
	}
	static void fm(short a) {
		System.out.println("short"+a);
	}
	static void fm(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		//1)�޼��� ���
		int result =  m1(10,20);
		System.out.println(result);
		
		//2)�� �޼��� ���
		m2(5,2);
		
		//3)�� �޼��� ���
		System.out.println(m3());
		
		//4)�� �޼��� ���
		m4();
		
		//System.out.println(m4()); ���ϰ��� ��� ����
		fm();
		fm(1);
		fm((short)2);
		fm(1,2);
		System.out.println();
		

	}

}
