package ex05;
/*
 * ����: �̳� Ŭ���� ����
 * =>Ư�� Ŭ���������� ����� �뵵�� ������ Ŭ����
 * =>Ŭ���� �ȿ� �����Ѵ�.
 */
public class Test01 {
	//1)top level ����ƽ �޼���ó�� ����Ѵ�.
	static class A{}
	//2)member inner class
	//=> �ν��Ͻ� ������ �ν��Ͻ� �޼��� ó�� �ν��Ͻ� �ּҰ� �־�߸� ����� �� �ִ�.
	class B{}
	public static void main(String[] args) {
		//3)local inner class
		//=>�޼��� �ȿ����� ����� �� �ִ�.
		//=>���� ���� ó�� ���� ���� Ű���带 ������ ����. ��)public private protected
	class C{}
	//3) anonymous local inner class
	Object obj = new Object() {};
	}
	//5) anomynous member inner class
	Object obj = new Object() {};
	
}
