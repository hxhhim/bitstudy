package step02.ex01;
/*
 * object Ŭ����
 * => �ڹ��� ��� Ŭ������ object�� ���� Ŭ�����̴�.
 * => object�� �ڹ��� ��Ӱ������� �ֻ��� Ŭ�����̴�.
 * => ��ӹ޴� �ٰ� �������� ������ �����Ϸ��� �ڵ����� ����Ѵ�.
 * =>object�� �ڹ� ��ü�� �⺻���� ������ �� �ʼ� ������ �޼��带 ����� �ش�.
 * 
 */
public class Exam01_1 {
	
	public static void main(String[] args) {
		A r = new A();
		System.out.println(r.var1);
		Object obj = new A();
		
		System.out.println(((A)obj).var1);
	}
}
