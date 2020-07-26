package ex01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test02 extends Frame{

	public Test02() {
		setLayout(new FlowLayout());
		Button btn = new Button("test");
		add(btn);
		//1)ActionListener를 로컬 이너 클래스로 구현
		/*
		class MyActionListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button click...");
			}
			
		}
		*/
		
		//MyActionListener  listen = new MyActionListener(); 
		
		//btn.addActionListener(listen);
	//	btn.addActionListener(new MyActionListener(){
			/*
				btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("button click...");
				}
			});
			*/
			
			btn.addActionListener((e)->{System.out.println("test");});	//람다식
			
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		
		setSize(300,200);
	}
	public static void main(String[] args) {
		Test02 f = new Test02();
		f.setVisible(true);

	}

}
