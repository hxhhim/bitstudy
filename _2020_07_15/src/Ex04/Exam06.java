package Ex04;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Exam06 extends Frame {

	public Exam06() {
		super("����������");
		
		Button btn1 = new Button("Button1");
		Button btn2 = new Button("Button2");
		Button btn3 = new Button("Button3");
		Button btn4 = new Button("Button4");
		Button btn5 = new Button("Button5");
		
		//Frame�� �⺻ ���̾ƿ�(BorderLayout)�� FlowLayout���� ��ü����!
		FlowLayout layoutManager = new FlowLayout();
		setLayout(layoutManager);
		
		add(btn1);
	    add(btn2);
	    add(btn3);
	    add(btn4);
	    add(btn5);
		
		//��ġ�����ڿ��� ��ġ�� �˷�����..
/*		add(btn1,BorderLayout.NORTH);
	    add(btn2,BorderLayout.EAST);
	    add(btn3,BorderLayout.SOUTH);
	    add(btn4,BorderLayout.WEST);
	    add(btn5,BorderLayout.CENTER);
*/		setSize(400,300);
	}
	public static void main(String[] args) {
		
		Exam06 f = new Exam06();
		f.setVisible(true);

	}

}
