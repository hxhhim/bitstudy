package basic;

public class InkjetPrinter extends Printer {
	int inkVolume;

	public InkjetPrinter(String model, String maker, String interType) {
		super(model, maker, interType);
		this.inkVolume = 100;
	}

	void print(int count) {
		if (numOfPaper == 0 && inkVolume < 5) {
			System.out.println("종이와 잉크가 부족합니다.");
			return;
		} else if (numOfPaper == 0) {
			System.out.println("종이가 부족합니다.");
			return;
		} else if (inkVolume < 5) {
			System.out.println("잉크가 부족합니다.");
			return;
		}

		System.out.println("잉크로 프린트를 시작합니다.");
		for (int i = 0; i < count; i++) {	// 입력한 값만큼 반복출력
			super.print();
			inkVolume -= 5;
		}
	}

	void showInfo() {
		super.showInfo();
		System.out.println("잉크 잔량은: " + inkVolume);
	}
}
