package Ex06;
import java.awt.Button;
/*
 * 이름
 * 전화번호
 * 이메일
 * 주소
 * 사진??
 * 연락처삭제,수정,차단,차단목록
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
		Label label = new Label("연락처 화면");
		add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
