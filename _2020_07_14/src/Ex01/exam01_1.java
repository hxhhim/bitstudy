package Ex01;

import java.util.Calendar;

public class exam01_1 {

	public static void main(String[] args) {
		
		//Calenda cal = new Calendar(); //protected �� ������ �����Ѵ�.
		//���� Ŭ������ ������Ű�� �Ҽ� Ŭ������ �ƴϸ�, ����(ȣ��,����)�� �����Ѵ�.
		
		Calendar cal = Calendar.getInstance();
		//Calendar�� �� ������ ȣ���� ���� �ߴ°�?
		//=>�����ڸ� ȣ���� �� ������ "�޷�"��ü�� ����� ����.
		//=>����?
		//  -�޷°�ü�� �����ϴ� �ڵ尡 �����ϱ� ������ 
		//	-�� �����ڰ� ���� �޷��� �����Ϸ��� System.currentTimeMillis()�� ����
		//	 ���� �ð������� ���� �ϰ�, �� ���� �ð��� ������ �޷°�ü�� �����ؾ� �ϴµ�,
		//	 �׷� ���ŷο��� ���ֱ� ���� ������ ����ƽ �޼��带 ������ �ش�.
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		if(cal2==cal3) {
			System.out.println("cal2==cal3");
		}
		System.out.println(cal);
		System.out.println(cal2);
		System.out.println(cal3);
	}

}
