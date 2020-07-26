package step02;
/*
 * ����: StringBuffer Ŭ����
 * ����(buffer)?
 * => �����͸� �����ϴ� �޸� ����, ����� �迭�� �����.
 * ĳ��(cache)?
 * => �����͸� ����ϴ� �޸� ����, ���� �ϵ� ��ũ�� �ӽ� ����
 */
public class Exam02_1 {

	public static void main(String[] args) {
		StringBuffer buf1 = new StringBuffer("hello");
		
		//StringBuffer�� mutable ��ü�̴�
		//=> �����͸� ������ �� �ִ�.
		//=> ��� ���ڿ��� �����ؾ� �ϴ� �����͸� ���鶧 ����� �� �ִ�.
		buf1.append(",world");
		System.out.println(buf1);

	}

}
/*
 * String vs StringBuffer vs StringBuilder?
 * 1)Immutable vs Mutable
 * =>String�� Immutable ��ü�μ� �����͸� ������ �� ����.
 * =>StringBuffer�� StringBuilder�� Mutable ��ü�μ� �����͸� ���� �Ҽ� �ִ�.
 * 2)Tread-safe ����
 * => StringBuffer�� thread-safe�ϴ�. �� ���� �����尡 ���ÿ� �����ϴ���,
 * �� ���� �� �����常�� �����͸� �����ϵ��� ������ �ش�.
 * =>StringBuilder�� thread-safe ���� �ʴ�. �� ���� �����尡 ���� �����Ͽ�
 * ���� �ٲܼ� �ִ�. �����Ͱ� ��ġ���� �ʴ� ������ �߻��Ѵ�. 
 */
