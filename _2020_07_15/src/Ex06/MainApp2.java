package Ex06;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MainApp2 extends Frame{

	public MainApp2() {
		super("event");
		
		//Frame�� �⺻���� �����Ǿ� �ִ� ��ġ������(BorderLayout)�� FlowLayout���� ��ü����!
		setLayout(new FlowLayout());
		Button btn = new Button("��ư1");
		add(btn);//FlowLayout�� ��� ��ġ�� ������ �ʿ䰡 ����. ������ ������� �¿��� ��� ���
		
		//��ư�� �������� ���� �ް� �ʹ�.
		//=>��ư�� Ŭ�� �̺�Ʈ�� ó���� �����ʸ� �������
		btn.addActionListener(new MyActionListener());
		setSize(600,480);
	}
	public static void main(String[] args) {
		MainApp2 f = new MainApp2();
		f.addWindowListener(new MyWindowListener2());
		f.setVisible(true);
		

	}

}
