package Ex03;

import java.util.HashSet;

public class Exam01_10 {

	public static void main(String[] args) {
		HashSet<Book4> set = new HashSet<>();
		
		//1) hashCode()재정의
		//2) equals()재정의
		Book4 b1 = new Book4("자바프로그래밍","홍길동",500);
		Book4 b2 = new Book4("자바프로그래밍","홍길동",500);
		
		System.out.printf("b1: %d\n", b1.hashCode());
		System.out.printf("b2: %d\n", b2.hashCode());
		if(b1.equals(b2)) {
			System.out.println("b1.hashCode");
		}
		set.add(b1);
		set.add(b2);
		Book4 b3 = new Book4("스위프트프로그래밍","임꺽정",300);
		set.add(b3); //b3가 b1,b2와 내용이 다름에도 불구하고 equals()와 hashCode()의값이 같기 때문에 
					 //b1과 같다고 간주되어 저장되지 않는다.
		//해결책?
		//=>인스턴스의 내용에 따라 다른 해시코드를 리턴해야 한다.
		//=>equals()는 각 객체의 내용을 모두 비교하여 모든항복의 값이 같을때 true를 리턴하게 해야한다.
		if(b1.equals(b3)) {
			System.out.println("b3.hashCode");
		}
		
		System.out.println("-------------------------");
		for(Book4 book :set) {
			System.out.println(book);
		}
		
	String a = new String("홍길동");
	String b = new String("홍길동");
	
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	}

}
