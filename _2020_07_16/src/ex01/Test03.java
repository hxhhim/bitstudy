package ex01;

public class Test03 {

	public static void main(String[] args) {
		//Fly ��Ģ�� Car ��Ģ�� ���ÿ� ������ Ŭ������ �ִ�.
		FlyCar obj = new FlyCar();
		
		//�翬�� �̰�ü�� Fly��Ģ�� �����⶧���� Fly ���۷����� �����Ҽ� �ִ�.
		Fly fly = obj;
		//���� �� ��ü�� Car ��Ģ�� ������ ������ Car ���۷����� ������ �� �ִ�.
		Car car = obj;
		
		fly.run();
		fly.takeOff();
		
		
		car.run();
		car.stop();
	}

}
