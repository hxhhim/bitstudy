package step01.ex01;

public class Exam01_3 {
	public static void main(String[] args) {
		Motor r1 = new Car();
		
		r1.cc = 100;
		r1.maker = "��Ʈ�ڵ���";
		
		//Car���� ������ ���� ���
//		r1.capacity = 200;
		/*
		 * ����
		 * �����Ϸ��� ���۷��� Ÿ�Կ� ����� �׸� ����Ҽ� �ִ�.
		 * ���� �ش� �ν��Ͻ� ������ �����Ѵ� �ϴ��� ���� �Ұ���! 
		 *
		 */
		//r1�� ���� Car �ν��Ͻ��� ����Ű�µ� Car�� ��� ����� ����ϴ� ����� ������
		Car c = (Car)r1;
		c.capacity = 200;
		c.cc = 200;
		System.out.println("r1.cc: "+r1.cc);
		System.out.println("c.cc: "+c.cc);
		
		
		Bus b1 = new Bus();
		Taxi t1 = new Taxi();
		Exam01_3 obj = new Exam01_3();
		obj.print(b1);
		obj.print(t1);
		
		
	}/*
	static void print(Bus b) {
		b.print();
		
	}
	static void print(Taxi t1) {
		t1.print();
	}*/
	
	void print(Car car) {  //������
		if(car instanceof Bus) { //Car�� Bus�� �ν��Ͻ����� Ȯ��
			Bus b = (Bus)car;
			b.print();
		}
		if(car instanceof Taxi) {
			Taxi t = (Taxi)car;
			t.print();
		}
	}
}
