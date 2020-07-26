package Ex06;
/*
 * 이름
 * 전화번호
 * 회원등급
 * 가입일
 * 등록
 * 조회
 */
import java.awt.Label;
import java.awt.Panel;

public class MemberPanel extends Panel{
	public MemberPanel() {
		Label label = new Label("회원 화면");
		add(label);
	}
}
