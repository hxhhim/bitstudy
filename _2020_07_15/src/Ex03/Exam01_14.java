package Ex03;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Iterator �з�
 * =>��Ͽ��� ���� ������ �ڵ带 ��üȭ��Ű�� ���� ���
 * =>�����ڴ� ����� ���� ��� �������� �� �ʿ䰡 ����.
 * 	 �ϰ��� ������� ���� ���� �� �ִ�.
 */
public class Exam01_14 {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<>();
		list.add("ȫ�浿");
		list.add("�Ӳ���");
		list.add("������");
		list.add("�̼���");
		list.add("���߱�");
		
		//���� ���� ������ ���,���� �����ִ� ��ü(Iterator)�� ������ ����!
		Iterator<String>iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
