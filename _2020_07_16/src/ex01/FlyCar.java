package ex01;

//=> Ŭ������ �� ���̻��� �������̽��� ������ �� �ִ�.
//=> ���� �ñ״�ó�� ���� �޼��尡 �ִ� ��� �� ���� �����ϸ� �ȴ�.
public class FlyCar implements Fly,Car{

	@Override
	public void stop() {
		System.out.println("�����....");
			
	}

	@Override
	public void run() {
		System.out.println("�޸���....");
		
	}

	@Override
	public void takeOff() {
		System.out.println("�̷��Ѵ�....");
		
	}
	
}
