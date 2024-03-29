package Ex03;

import java.util.Hashtable;

/*
 * HashTable
 * =>값을 저장하는 규칙
 * 	- key 객체의 해시코드를 이용해서 value를 저장하고 꺼낸다.
 *  - key로 사용할 클래스느 반드시 hashCode()와 equals()를 오보라이딩 해야한다.
 *  -key와 value에 null을 사용할할수 없다.
 *   -Thread- safe 하다. 멀티스레드 환경을 지원한다.
 *	단 동기화 처리로 속도가 느리다.
 */
public class Exam01_12 {

	public static void main(String[] args) {
		Hashtable<String, Book>map = new Hashtable();
		
		Book b1  = new Book("1111","홍길동",100);
		Book b2  = new Book("1111","홍길동",100);
		Book b3  = new Book("2222","임꺽정",300);
		Book b4  = new Book("3333","유관순",400);
		Book b5  = new Book("4444","이순신",500);
		
		map.put("aaa", b1);
		map.put("bbb", b1);
		map.put("ccc", b1);
		map.put("ddd", b1);
		map.put("eee", b1);
		map.put("fff", b1);
	//	map.put(null, b5);		//실행오류!key에 null을 허락하지 않는다.
	//	map.put("hhh", null);	//실행오류! value에 null을 허락하지 않는다.
		
		System.out.printf("aaa:%s\n",map.get("aaa").toString());
		System.out.printf("bbb:%s\n",map.get("bbb").toString());
		System.out.printf("ccc:%s\n",map.get("ccc").toString());
		System.out.printf("ddd:%s\n",map.get("ddd").toString());
		System.out.printf("eee:%s\n",map.get("eee").toString());
		System.out.printf("fff%s\n",map.get("fff").toString());
	//	System.out.printf("(null):%s\n",map.get(null).toString());
	//	System.out.printf("hhh%:s\n",map.get("hhh").toString());
		

	}

}
