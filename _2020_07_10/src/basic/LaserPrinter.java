package basic;

public class LaserPrinter extends Printer {
	int tonerVolume;

	public LaserPrinter(String model, String maker, String interType) {
		super(model,maker,interType);
		this.tonerVolume = 100;
	}

	void print(int count) {
		if (numOfPaper == 0 && tonerVolume < 5) {
			System.out.println("종이와 토너가 부족합니다.");
			return;
		} else if (numOfPaper == 0) {
			System.out.println("종이가 부족합니다.");
			return;
		} else if (tonerVolume < 5) {
			System.out.println("토너가 부족합니다.");
			return;
		}

		System.out.println("레이저로 프린트를 시작합니다.");
		for (int i = 0; i < count; i++) {	// 입력한 값만큼 반복출력
			super.print();
			tonerVolume -= 5;
		}
	}

	void showInfo() {
		super.showInfo();
		System.out.println("토너 잔량은: " + tonerVolume);
	}
}
