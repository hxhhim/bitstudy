package Ex06;
import java.awt.Button;
/*
 * �̸�
 * ��ȭ��ȣ
 * �̸���
 * �ּ�
 * ����??
 * ����ó����,����,����,���ܸ��
 */
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactPanel extends Panel implements ActionListener{
	TextField nameTF;
	TextField phoneNumTF;
	TextField emailTF;
	TextField addressTF;
	TextField password;
	Button addBtn;
	Button cancelBtn;
	Button deleteBtn;
	ContactDao contactDao;
	java.awt.List contactLST;
	
	
	
	public ContactPanel() {
		Label label = new Label("����ó ȭ��");
		add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
