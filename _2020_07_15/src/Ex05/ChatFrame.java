package Ex05;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class ChatFrame extends Frame{
	public ChatFrame() {
		super("Chatting Application");
		TextArea ta = new TextArea();
		//TextArea�� �ʺ�� ���̴� ������ �ʿ䰡 ����.
		//����?BorderLayout�� �ش� ������ �ڽ� �����츦 �� ä��� �����̴�.
		add(ta,BorderLayout.CENTER);
		
		MessageinputBox inputBox = new MessageinputBox();
		add(inputBox, BorderLayout.SOUTH);
		
		setSize(300,500);
	}
}
