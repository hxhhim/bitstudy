package Ex04;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Exam05 extends Frame {

	public Exam05() {
		super("����������");
		
		Button yesBtn = new Button("��");
		Button noBtn = new Button("�ƴϿ�");
		
		//��ġ�����ڿ��� ��ġ�� �˷�����..
		add(yesBtn,BorderLayout.WEST);
	    add(noBtn,BorderLayout.EAST);
		setSize(400,300);
	}
	public static void main(String[] args) {
		
		Exam05 f = new Exam05();
		f.setVisible(true);

	}

}
