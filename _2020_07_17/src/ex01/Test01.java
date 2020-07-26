package ex01;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test01 extends Frame{

	public Test01() {
		/*
		//1)���� �̳� Ŭ����
		class MyWindowListener extends WindowAdapter{
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}
//		MyWindowListener listen = new MyWindowListener();
//		addWindowListener(listen);
		addWindowListener(new MyWindowListener());
		*/
		
		//2)�͸� �̳� Ŭ����
		//=>��ü�� �� �� ������ �����Ŷ��, ���� Ŭ������ �������� ������ �ʿ䰡 �ִ°�?
		//=>���� ǥ����� �̿��Ͽ� Ŭ��������� ��ü������ �ѹ��� ó������.
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(300,300);
	}
	public static void main(String[] args) {
		Test01 f = new Test01();
		f.setVisible(true);

	}

}
