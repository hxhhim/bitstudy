package Ex06;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//윈도우 이벤트를 처리할 리스너 만들기
//1)windowListener 규칙을 직집구현하기
//2)windowAdapter를 상속받기
public class MyWindowListener2 extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("WindowClosing");
		System.exit(0);
	}

	
}
