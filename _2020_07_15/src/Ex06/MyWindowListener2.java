package Ex06;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//������ �̺�Ʈ�� ó���� ������ �����
//1)windowListener ��Ģ�� ���������ϱ�
//2)windowAdapter�� ��ӹޱ�
public class MyWindowListener2 extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("WindowClosing");
		System.exit(0);
	}

	
}
