package bookex9;

public class AnonymousExample1 {

	public static void main(String[] args) {
		Anonymous1 anony = new Anonymous1();
		//익명객체필드사용
		anony.field.turnOn();
		//익명객체로컬변수 사용
		anony.method1();
		//익명 객체 매개값 사용
		anony.method2(new RemoteControl(){
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Smart Tv를 켭니다.");
			}
		 }
		);

	}

}
