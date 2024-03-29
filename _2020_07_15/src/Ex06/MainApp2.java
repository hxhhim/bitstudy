package Ex06;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MainApp2 extends Frame{

	public MainApp2() {
		super("event");
		
		//Frame에 기본으로 설정되어 있는 배치관리자(BorderLayout)를 FlowLayout으로 교체하자!
		setLayout(new FlowLayout());
		Button btn = new Button("버튼1");
		add(btn);//FlowLayout의 경우 우치를 지정할 필요가 없다. 더해진 순서대로 좌에서 우로 출력
		
		//버튼을 눌렀을대 보고 받고 싶다.
		//=>버튼의 클릭 이벤트를 처리할 리스너를 등록하자
		btn.addActionListener(new MyActionListener());
		setSize(600,480);
	}
	public static void main(String[] args) {
		MainApp2 f = new MainApp2();
		f.addWindowListener(new MyWindowListener2());
		f.setVisible(true);
		

	}

}
