package Ex03;

import java.util.ArrayList;

public class Exam01_5 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("ȫ�浿");
		names.add("ȫ�浿");	//���� ���� ��ü(���ּ�)����
		names.add(null);    //null �� ���� ����
		names.add("ȫ�浿");

			
		for(int i =0;i<names.size();i++)
			System.out.println(names.get(i));
			
		for(String s :names) {
			System.out.println(s);
			
		}
;	}

}
