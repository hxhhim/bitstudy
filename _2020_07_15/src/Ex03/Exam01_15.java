package Ex03;

import java.util.HashSet;
import java.util.Iterator;

public class Exam01_15 {

	public static void main(String[] args) {
		HashSet<String> list = new HashSet<>();
		list.add("ȫ�浿");
		list.add("�Ӳ���");
		list.add("������");
		list.add("�̼���");
		list.add("���߱�");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
