package Ex03;

import java.util.HashMap;

public class Exam01_11 {

	public static void main(String[] args) {
		HashMap<String, Book> map = new HashMap<>();
		
		Book b1  = new Book("1111","ȫ�浿",100);
		Book b2  = new Book("1111","ȫ�浿",100);
		Book b3  = new Book("2222","�Ӳ���",300);
		Book b4  = new Book("3333","������",400);
		Book b5  = new Book("3333","�̼���",500);
		Book b6  = new Book("4444","�̼���",600);
		
		//�����Ҷ� ����ڵ带 �����ϴ� Ű ��ü�� String�� ����Ѵ�.
		//String Ŭ������ ������ �ٸ��� �ٸ� �ؽ��ڵ带 �����ϰ�,
		//������ ������ ���� �ؽ��ڵ带 ������� hashCode() �� �������Ͽ��� �����̴�.
		//���� ������ ���� ��ü�� ���� true�� �����ϰԲ� equals()�� ������ �Ͽ��⶧���̴�.
		//����!!
		//hashCode(),equals()���������� ���� Ŭ������ key�� ����ؼ��� �ȵȴ�.
		map.put("aaa",b1);
		map.put("aaa",b6);
		map.put("bbb",b1);	//���� �ּҸ� �����Ҽ� �ִ�.
		map.put("ccc", b2);
		map.put("ddd", b3);
		map.put("eee", b4);
		map.put("fff", b5);
		map.put(null, b5);	//key�� null�� ����Ѵ�.
		map.put("hhh", null); // value�� null�� ����Ѵ�.
		
		System.out.printf("aaa:%s\n",map.get("aaa").toString());
		System.out.printf("bbb:%s\n",map.get("bbb").toString());
		System.out.printf("ccc:%s\n",map.get("ccc").toString());
		System.out.printf("ddd:%s\n",map.get("ddd").toString());
		System.out.printf("eee:%s\n",map.get("eee").toString());
		System.out.printf("fff%s\n",map.get("fff").toString());
		System.out.printf("(null):%s\n",map.get(null).toString());
		System.out.printf("hhh%:s\n",map.get("hhh").toString());
	}

}
