package Ex03;

import java.util.HashMap;

/*
 * HashMap
 * =>���� �����ϴ� ��Ģ
 * 	- key ��ü�� �ؽ��ڵ带 �̿��ؼ� value�� �����ϰ� ������.
 *  - key�� ����� Ŭ������ �ݵ�� hashCode()�� equals()�� �������̵� �ؾ��Ѵ�.
 *  - key�� value�� null�� ������Ҽ� �ִ�.
 *  - Thread-safe �����ʴ�. ��Ƽ������ ȯ�濡�� �����Ͽ� �������.
 *	
 */
public class Exam01_13 {

	public static void main(String[] args) {
		HashMap<Mykey, Book>map = new HashMap();
		
		Book b1  = new Book("1111","ȫ�浿",100);
		Book b2  = new Book("2222","�Ӳ���",300);
		Book b3  = new Book("3333","������",400);
		
		Mykey key1 = new Mykey(10,100);
		Mykey key2 = new Mykey(20,200);
		Mykey key3 = new Mykey(23,9898);
		
		//1)�� ����:key ��ü�� �ؽ��ڵ带 �̿��Ͽ� value�� �����Ѵ�.
		map.put(key1, b1);
		map.put(key2, b2);
		map.put(key3, b3);
		
		//2)�� ������:key ��ü�� �ؽ��ڵ带 �̿��Ͽ� value�� ������.
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
