package Ex03;

import java.util.HashMap;

/*
 * HashMap
 * =>값을 저장하는 규칙
 * 	- key 객체의 해시코드를 이용해서 value를 저장하고 꺼낸다.
 *  - key로 사용할 클래스느 반드시 hashCode()와 equals()를 오보라이딩 해야한다.
 *  - key와 value에 null을 사용할할수 있다.
 *  - Thread-safe 하지않다. 멀티스레드 환경에서 주의하여 사용하자.
 *	
 */
public class Exam01_13 {

	public static void main(String[] args) {
		HashMap<Mykey, Book>map = new HashMap();
		
		Book b1  = new Book("1111","홍길동",100);
		Book b2  = new Book("2222","임꺽정",300);
		Book b3  = new Book("3333","유관순",400);
		
		Mykey key1 = new Mykey(10,100);
		Mykey key2 = new Mykey(20,200);
		Mykey key3 = new Mykey(23,9898);
		
		//1)값 저장:key 객체의 해시코드를 이용하여 value를 저장한다.
		map.put(key1, b1);
		map.put(key2, b2);
		map.put(key3, b3);
		
		//2)값 꺼내기:key 객체의 해시코드를 이용하여 value를 꺼낸다.
		System.out.println(map.get(key1));
		System.out.println(map.get(key2));
		System.out.println(map.get(key3));
		
		Mykey key4 = new Mykey(10,100);
		System.out.println();
		System.out.println(map.get(key4));
		System.out.println(key3.hashCode());
		System.out.println(key4.hashCode());
		

	}

}
