package Ex03;

import java.util.HashMap;
import java.util.Iterator;

public class Exam01_16 {

	public static void main(String[] args) {
		HashMap<Integer,String>list = new HashMap<>();
		
		list.put(100,"ȫ�浿");
		list.put(101,"�Ӳ���");
		list.put(102,"������");
		list.put(103,"�̼���");
		list.put(104,"���߱�");
		
		Iterator<String> iterator = list.values().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
