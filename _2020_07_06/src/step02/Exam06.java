package step02;

public class Exam06 {

	public static void main(String[] args) {
		Board5 b1 = new Board5();
		b1.contents = "�����Դϴ�.";
		b1.writer = "ȫ�浿";
		b1.printInfo();
		//�޼��� ȣ�⿡ ���� ǥ��
		//1)b1 �ν��Ͻ��� ���� printInfo() ����� �����϶�.
		//2)b1 �����Ϳ� ���� printInfo() ������ �����϶�.
		//3)b1 ��ü�� printInfo() �޽����� ������.
		
		System.out.println("----------------------------");
		
		//�⺻ ������ ��� �ٸ� �����ڸ� �����Ѵ�.
		//=> ���ڿ� ���� ���� �޴� ������ ȣ��
		Board5 b2 = new Board5("�׽�Ʈ","�����̷���","ȫ�浿");
		b2.printInfo();
		
		Board5 b3 = new Board5(1,"����");
		b3.printInfo();
	}

}
