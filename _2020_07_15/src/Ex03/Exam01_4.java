package Ex03;

import java.util.ArrayList;
import java.util.Date;

public class Exam01_4 {

	public static void main(String[] args) {
		
		
		
		/*
		ArrayList names = new ArrayList();
		names.add("ȫ�浿");
		names.add(new Date());
		names.add(new Integer(20));
		names.add(true);
		
		
		//������: Ư�� Ÿ���� ��ü(���ּ�)�� �����ϰ� ������ �װ��� ���� ����� ����.
		//�ذ�å:� Ÿ���� ��ü�� ������ �� ��������!
		System.out.println("---------------");
		for(int x=0; x<names.size();x++) {
			System.out.println(names.get(x));
		}*/
		
		//2)���ʸ� ��� �غ���
		//=> ArrayList�� ���� �������� Ÿ���� �����Ѵ�.
		//=> ArrayList<String> names2 = new ArrayList<String>();
		//ArrayList<String> names2 = new ArrayList<String>();
		ArrayList<String> names2 = new ArrayList<>();//new ��ɴ����� Ÿ�������� ������ �� �ִ�.
		names2.add("ȫ�浿"); 	//��� ��Ʈ�� ��ü�� �ּҸ� ����
		names2.add(new String("�Ӳ���")); //�׳� �Ϲ� ��Ʈ�� ��ü�� �ּҸ� ����
//		names2.add(new Integer(2)); �����Ͽ���! ������ Ÿ���� �ƴϸ� ����Ұ�
//		names2.add(new Date());
		
		//���׸� ��� ����;
		//=> ������ Ÿ�Կܿ� �ٸ� Ÿ���� ��ü�� ���� �� �� ����.
		//=> �װ͵� ���� �� ������ �ܰ迡�� �˻� �Ѵ�. =>������ ���� ������ �ִ�.
		//=>�������� �ǵ��� ���Ͽ� �����ϴ� ���� �ּ�ȭ �Ҽ� �ִ�.=> ���α׷� �������� ��������.
	}
}
