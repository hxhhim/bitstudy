package ex01;

public class Test04 {

	public static void main(String[] args) {
		MyCar car = new MyCar();
		car.start(); //Motor 인터페이스로부터 상속받은 메서드
		car.run();   //Sedan과 Truck 인터페이스로부터 상속받은 메서드
		car.dump();  //Truck 인터페이스로부터 상속 받은 메서드
		car.openSunroof();
		car.stop();
	}

}
