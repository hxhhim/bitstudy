package Ex04;

import java.awt.Button;
import java.awt.Frame;

public class Exam03 extends Frame {

	public Exam03() {
		super("����������");
		//��ư ������ ���� =>��ư�� �������̴�.����������
		//������ ���α׷��� ���迡���� ���� ���̴� ������ �������̴�.
		//��)üũ����,������ư,��ũ�ѹ�,��,�޴�,��ȭ����,�����̴��� ��
		Button yesBtn = new Button("��");
		Button noBtn = new Button("�ƴϿ�");
		//��ư �����츦 ������ ������ ���� ���δ�.
		//=>������ �ڽ� �����츦 ���϶� ����ġ�� �����ϴ� ��ġ�����ڰ� �ִ�.
		//=> Frame�� �⺻ ��ġ�����ڴ� "BoderLayout"��� ��ü�̴�.
		//�������� ���̸�, ��� ������ ���ٿ�����. �� �����.
		//���� ���� �ΰ��� ��ư�� �����ӿ� ���ϸ�, �� �������� ���� ��ư�� �� ���� ���δ�.
		this.add(yesBtn);
		this.add(noBtn);
		setSize(400,300);
	}
	public static void main(String[] args) {
		
		Exam03 f = new Exam03();
		f.setVisible(true);

	}

}
