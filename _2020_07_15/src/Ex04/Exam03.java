package Ex04;

import java.awt.Button;
import java.awt.Frame;

public class Exam03 extends Frame {

	public Exam03() {
		super("윈도우제목");
		//버튼 윈도우 생성 =>버튼도 윈도우이다.작은윈도우
		//윈도우 프로그래밍 세계에서는 눈에 보이는 모든것이 윈도우이다.
		//예)체크상자,라디오버튼,스크롤바,탭,메뉴,대화상자,슬라이더바 등
		Button yesBtn = new Button("예");
		Button noBtn = new Button("아니오");
		//버튼 윈도우를 프레임 윈도우 위에 붙인다.
		//=>윈도우 자식 윈도우를 붙일때 그위치를 조정하는 배치관리자가 있다.
		//=> Frame의 기본 배치관리자는 "BoderLayout"라는 객체이다.
		//여러개를 붙이면, 계속 그위에 덧붙여진다. 즉 덮어쓴다.
		//따라서 다음 두개의 버튼을 프레임에 더하면, 맨 마지막에 더한 버튼이 맨 위에 놓인다.
		this.add(yesBtn);
		this.add(noBtn);
		setSize(400,300);
	}
	public static void main(String[] args) {
		
		Exam03 f = new Exam03();
		f.setVisible(true);

	}

}
