package ex01;

public class MyCar implements BitCar {

	@Override
	public void run() {
		System.out.println("�޸���....");

	}

	@Override
	public void openSunroof() {
		System.out.println("������� ����....");

	}

	@Override
	public void start() {
		System.out.println("�õ��Ǵ�....");

	}

	@Override
	public void dump() {
		System.out.println("���� ������....");

	}

	@Override
	public void stop() {
		System.out.println("�����....");

	}

}
