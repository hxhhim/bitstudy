package basic;

public class Printer {
	String model;	// 모델명
	String maker;	// 제조사
	String interType;//인터페이스종류
	int numOfPaper;	// 종이잔량
	int numOfPrint;	// 인쇄매수

	Printer(String model, String maker, String interType) {
		this.model = model;
		this.maker = maker;
		this.interType = interType;
		numOfPaper = 100;
		numOfPrint = 0;
	}

	void print() {
		numOfPaper--;	// 프린트 할때마다 종이 잔량 -1
		numOfPrint++;	// 프린트 할때마다 인쇄 매수 +1
	}

	void showInfo() {
		System.out.println("프린터 모델명: " + model);
		System.out.println("프린터 제조사: " + maker);
		System.out.println("프린터 인터페이스 종류: " + interType);
		System.out.println("종이 잔량: " + numOfPaper);
		System.out.println("인쇄 매수: " + numOfPrint);
	}
}
