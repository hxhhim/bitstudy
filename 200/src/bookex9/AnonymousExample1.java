package bookex9;

public class AnonymousExample1 {

	public static void main(String[] args) {
		Anonymous1 anony = new Anonymous1();
		//�͸�ü�ʵ���
		anony.field.turnOn();
		//�͸�ü���ú��� ���
		anony.method1();
		//�͸� ��ü �Ű��� ���
		anony.method2(new RemoteControl(){
			@Override
			public void turnOn() {
				System.out.println("SmartTV�� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("Smart Tv�� �մϴ�.");
			}
		 }
		);

	}

}
