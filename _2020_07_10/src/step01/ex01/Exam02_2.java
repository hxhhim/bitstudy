package step01.ex01;

public class Exam02_2 {

	public static void main(String[] args) {
		Calc c = new Calc();
		c.plus(10); //10+20;
		c.plus(20);
		System.out.println(c.result);
		
		//���ο� �䱸����:
		//1)�迭�� ���� ���ϴ� ����� �ʿ�!
		
		int[] values = {10,20,30,40};
		Calc2 c2 = new Calc2();
		c2.plusArray(values);
		c2.plus(150);
		c2.plusTwin(50, 123);
		System.out.println(c2.result);
		
		Calc3 c3 = new Calc3();
		
		c3.plus(values);
		c3.plus(150);
		c3.plus(50, 123);
		System.out.println(c3.result);
	}

}
