package step02;
/*
 * ���� : String Ŭ���� - String Ŭ���� ���
 * => String Ŭ������ ���ڿ��� �����ϱ� ���ؼ� char[] �迭�� ����Ѵ�.
 * �� String �ν��Ͻ��� �����ϸ�, Heap ������ ���ڿ��� �����ϱ� ����
 * char[] �迭�� �غ��Ѵ�.
 */
public class Exam01_2 {

	public static void main(String[] args) {
		String s1 = new String("Hello, world!");
		System.out.println(s1);
		
		//String �ν��Ͻ��� ���� ����ǥ���
		String s2 = "Hello, world!";//=> new String("Hello, world!")�� ����.
		System.out.println(s2);

	}

}
