package Ex03;

import java.util.HashSet;

public class Exam01_10 {

	public static void main(String[] args) {
		HashSet<Book4> set = new HashSet<>();
		
		//1) hashCode()������
		//2) equals()������
		Book4 b1 = new Book4("�ڹ����α׷���","ȫ�浿",500);
		Book4 b2 = new Book4("�ڹ����α׷���","ȫ�浿",500);
		
		System.out.printf("b1: %d\n", b1.hashCode());
		System.out.printf("b2: %d\n", b2.hashCode());
		if(b1.equals(b2)) {
			System.out.println("b1.hashCode");
		}
		set.add(b1);
		set.add(b2);
		Book4 b3 = new Book4("������Ʈ���α׷���","�Ӳ���",300);
		set.add(b3); //b3�� b1,b2�� ������ �ٸ����� �ұ��ϰ� equals()�� hashCode()�ǰ��� ���� ������ 
					 //b1�� ���ٰ� ���ֵǾ� ������� �ʴ´�.
		//�ذ�å?
		//=>�ν��Ͻ��� ���뿡 ���� �ٸ� �ؽ��ڵ带 �����ؾ� �Ѵ�.
		//=>equals()�� �� ��ü�� ������ ��� ���Ͽ� ����׺��� ���� ������ true�� �����ϰ� �ؾ��Ѵ�.
		if(b1.equals(b3)) {
			System.out.println("b3.hashCode");
		}
		
		System.out.println("-------------------------");
		for(Book4 book :set) {
			System.out.println(book);
		}
		
	String a = new String("ȫ�浿");
	String b = new String("ȫ�浿");
	
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	}

}
