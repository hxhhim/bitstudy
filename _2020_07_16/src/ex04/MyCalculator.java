package ex04;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator extends Frame{
		TextField tf1;
		TextField tf2;
		TextField tf3;
		Choice opChooser;
		
		public class ComputeBtnListener implements ActionListener{
			
			public ComputeBtnListener() {}
					
			@Override
			public void actionPerformed(ActionEvent e) {
				String op = opChooser.getSelectedItem();
				int a = Integer.parseInt(tf1.getText());
				int b = Integer.parseInt(tf2.getText());
				int result = 0;
				switch(op) {
				case "+":result = a +b;break;
				case "-":result = a -b;break;
				case "*":result = a *b;break;
				case "/":result = a /b;break;
				}
				tf3.setText(Integer.toString(result));
				
			}
		}
	public MyCalculator () {
		super("계산기");
		
		//레이아웃 매니저 교체: BorderLayout --->FlowLayout
		setLayout(new FlowLayout());
		
		tf1 = new TextField();
		tf1.setPreferredSize(new Dimension(50,30));
		tf2 = new TextField();
		tf2.setPreferredSize(new Dimension(50,30));
		opChooser = new Choice();
		opChooser.add("+");
		opChooser.add("-");
		opChooser.add("*");
		opChooser.add("/");
		Button computeBtn = new Button("계산");
		tf3 = new TextField();
		tf3.setPreferredSize(new Dimension(100,30));
		
		add(tf1); add(opChooser); add(tf2); add(computeBtn); add(tf3);
		setSize(640,200);
		addWindowListener(new MyWindowListener());
		ComputeBtnListener listener = new ComputeBtnListener();
				//new ComputeBtnListener(opChooser,tf1,tf2,tf3);
		
		computeBtn.addActionListener(listener);
	}
	public static void main(String[] args) {
		MyCalculator f = new MyCalculator();
		f.setVisible(true);
	}
}