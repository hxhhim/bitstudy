package book;

public class Car3 {

	int speed;
	
	void run() {
		System.out.println(speed+"���� �޸��ϴ�.");
	}
	public static void main(String[] args) {
		Car3 myCar = new Car3();
		myCar.speed = 60;
		myCar.run();

	}

}
