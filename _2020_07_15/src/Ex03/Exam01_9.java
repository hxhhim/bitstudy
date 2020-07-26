package Ex03;

import java.util.HashSet;

public class Exam01_9 {

	public static void main(String[] args) {
		HashSet<Book3> set = new HashSet<>();
		
		//1) hashCode()������
		//2) equals()������
		Book3 b1 = new Book3("�ڹ����α׷���","ȫ�浿",500);
		Book3 b2 = new Book3("�ڹ����α׷���","ȫ�浿",500);
		
		System.out.printf("b1: %d\n", b1.hashCode());
		System.out.printf("b2: %d\n", b2.hashCode());
		if(b1.equals(b2)) {
			System.out.println("b1.hashCode");
		}
		set.add(b1);
		set.add(b2);
		
		System.out.println("-------------------------");
		for(Book3 book :set) {
			System.out.println(book);
		}

	}

}
