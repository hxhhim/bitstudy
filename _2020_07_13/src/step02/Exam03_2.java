package step02;

import java.sql.Date;
class A{
	int var = 100;
	public String toString() {			//���ϴ� ������ ����Ϸ��� tostring�� �������ض�
        return "A[var: "+var+"]";
    }
}
public class Exam03_2 {

	public static void main(String[] args) {
		Object obj = new Object();
		A test = new A();
		
		System.out.println(test);
		System.out.println(obj);
		
		long currTime = System.currentTimeMillis();
		Date today = new Date(currTime);
		//���� �̸��Ǥ� Ŭ������ ���ÿ� ����ϰ� �ʹٸ�,
		//�� Ŭ������ �̸��� ��ü�̸�(��Ű������ ������ �̸���)���� �����Ѵ�.
		java.util.Date today2 = new java.util.Date(currTime);
		System.out.println(today);
		System.out.println(today2);
	}

}
