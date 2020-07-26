package book;

public class Car3 {

	int speed;
	
	void run() {
		System.out.println(speed+"으로 달립니다.");
	}
	public static void main(String[] args) {
		Car3 myCar = new Car3();
		myCar.speed = 60;
		myCar.run();

	}

}
