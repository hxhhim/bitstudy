package Ex03;

import java.util.Hashtable;

/*
 * HashTable
 * =>���� �����ϴ� ��Ģ
 * 	- key ��ü�� �ؽ��ڵ带 �̿��ؼ� value�� �����ϰ� ������.
 *  - key�� ����� Ŭ������ �ݵ�� hashCode()�� equals()�� �������̵� �ؾ��Ѵ�.
 *  -key�� value�� null�� ������Ҽ� ����.
 *   -Thread- safe �ϴ�. ��Ƽ������ ȯ���� �����Ѵ�.
 *	�� ����ȭ ó���� �ӵ��� ������.
 */
public class Exam01_12 {

	public static void main(String[] args) {
		Hashtable<String, Book>map = new Hashtable();
		
		Book b1  = new Book("1111","ȫ�浿",100);
		Book b2  = new Book("1111","ȫ�浿",100);
		Book b3  = new Book("2222","�Ӳ���",300);
		Book b4  = new Book("3333","������",400);
		Book b5  = new Book("4444","�̼���",500);
		
		map.put("aaa", b1);
		map.put("bbb", b1);
		map.put("ccc", b1);
		map.put("ddd", b1);
		map.put("eee", b1);
		map.put("fff", b1);
	//	map.put(null, b5);		//�������!key�� null�� ������� �ʴ´�.
	//	map.put("hhh", null);	//�������! value�� null�� ������� �ʴ´�.
		
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
