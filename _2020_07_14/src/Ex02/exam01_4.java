package Ex02;

public class exam01_4 {

	public static void main(String[] args) {
		//1)���ͷ��� �ν��Ͻ� ����(����ڽ�)
		Integer obj1 = 20; //String ó�� ��� ����ҿ� �ν��Ͻ��� �����Ѵ�.
		Integer obj2 = 20; // ������ ������ �ν��Ͻ� �ּҸ� �����Ѵ�.
		if(obj1 == obj2) {
			System.out.println("obj1==obj2");
		}
		
		
		int i = 40;
		i = 50;
		i = 60;
		obj1 =30;
		obj2 = 30;
		obj1 = 40;
		obj1 = 50;
		
		
		
		
		Integer obj3 = 30;
		if(obj2 == obj3) {
			System.out.println("obj2==obj3");
		}
		
		
		
		if(obj1 == obj2) {
			System.out.println("obj1==obj2");
		}
		//2) ���� new �����ڸ� �̿��Ͽ� �ν��Ͻ� ����
		
		Integer obj4 = new Integer(100); //���� �ν��Ͻ� �����Ѵ�.
		Integer obj5 = new Integer(100); //���� �ν��Ͻ� �����Ѵ�.
		if(obj4 == obj5) {//�ּҰ� �ٸ���.
			System.out.println("obj4==obj5");
		}
		if(obj4.equals(obj5)) {
			System.out.println("obj4.equals(obj5)");
		}
		

	}

}
