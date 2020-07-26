package Ex04;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Exam05 extends Frame {

	public Exam05() {
		super("윈도우제목");
		
		Button yesBtn = new Button("예");
		Button noBtn = new Button("아니오");
		
		//배치관리자에게 위치를 알려주자..
		add(yesBtn,BorderLayout.WEST);
	    add(noBtn,BorderLayout.EAST);
		setSize(400,300);
	}
	public static void main(String[] args) {
		
		Exam05 f = new Exam05();
		f.setVisible(true);

	}

}
