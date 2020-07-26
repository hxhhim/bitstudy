package step02;

/*
 * ����: String Ŭ���� - Literal String �ν��Ͻ��� �Ϲ� String �ν��Ͻ�
 */
public class Exam01_3 {

	public static void main(String[] args) {
		//�Ϲ� String �ν��Ͻ�����: Heap ������ �ν��Ͻ��� ����
		//=>������ �÷����� ���: �������� �Ǹ� ������ �÷��Ͱ� �޸� ������ �ش�.
		//=>�Ϲ� �ν��Ͻ��̴�.
		String s1 = new String("hello");
		
		//Literal String �ν��Ͻ� ����: constant string pool�� ����
		//=>JVM�� �����Ҷ����� �����ȴ�.
		//=> �ߺ��� ������� �ʴ� �ν��Ͻ�. �ߺ� �������� �ʴ´�.
		//=>�޸𸮸� �� �� ȿ�������� ����ϱ� ���� 
		String s2 = "hello";//=> new String("hello")�� ����.
		
		if(s1 == s2) {//���δٸ� String �ν��Ͻ����� ����
			System.out.println("s1==s2");
		}
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2)");
			
		}
		String x1 = new String("hello");
		String x2 = "hello";//�̹� constant string pool�� "hello"
		//��Ʈ�� �ν��Ͻ��� �����ϱ� ������, ���� �������� �ʰ� �ν��Ͻ��� �ּҰ� ���ϵȴ�.
		if(s1 == x2) {//Heap�� ������ �ν��Ͻ��� �ٸ���.
			System.out.println("s1==x1");
			
		}if(s2 == x2) {//constant string pool�� ������ �ν��Ͻ��� ����.
			System.out.println("s2==x2");
		}
		String x3 = "hello";
		if(x2 == x3) {
			System.out.println("x2==x3");
		}

	}

}

/*
 * String s ="���ͷ�";
 * =>���ͷ�(literal)�� ������ ��Ʈ�� �ν��Ͻ���
 * 		��� ��Ʈ�� Ǯ(constant string pool)���� �����Ѵ�.
 * =>�޸𸮸� ȿ�������� �����ϱ� ����
 * 	 ���� ���� �ν��Ͻ��� �ߺ� �������� �ʴ´�.
 * 
 * ���ͷ�(literal)?
 * =>���� �ڵ�� ���� ǥ���Ѱ�.
 * int i = 10;//������?10
 * boolean b = true; //���ͷ�=> true
 * 
 */













