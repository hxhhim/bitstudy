package step01;

/*
 * JVM �޸� ���� - Ŭ���� �����
 * 
 */
class test{
	int a;
	int b; 
	public void get(int a, int b) {}
}
public class Exam01 {
	int a;
	static int b;
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		Exam01 ref;
		ref = new Exam01();
		test ref1 = new test();
		

	}

}
/*	JVM�� Ŭ������ �����ϴ� ����
 *  1)Verification: .class ������ ��ȿ�� �˻�
 *  => ��¥ �����Ϸ��� ������ ����Ʈ�ڵ尡 �´��� �˻��Ѵ�.
 *  => ���� ���� JVM �������� ������ �� �ִ��� �˻��Ѵ�.
 *  2) Preparation: ����(static) �ڿ��غ�
 *  => .class �� �����Ҽ� �ֵ��� �޸𸮿� �ø���.
 *  => static �ʵ�(���� �� ���)�� �غ��ϰ�, �⺻ ���� �Ҵ��Ѵ�.
 *  3) Resolution: �� Ŭ������ �����ϴ� �ٸ� Ŭ���� ���� ����
 *  => ��Ŭ������ �����ϴ� �ٸ� Ŭ������ �������̽��� ��G�Ҽ� �ֵ��� ������ �غ��Ѵ�.
 *  4) main() �޼��带 ȣ���Ѵ�.
 * 
 */
