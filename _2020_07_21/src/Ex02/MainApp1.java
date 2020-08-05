package Ex02;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainApp1 extends Frame implements ActionListener{
	public MainApp1() {
		super("��Ʈķ��");
		prepareMenu();
		
		//1)�������� �ݱ� ��ư �̺�Ʈ�� ó���� �����ʵ��
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//2)������ ũ�� ����
		setSize(500,400);
	}
	private void prepareMenu() {
		MenuBar menuBar = new MenuBar();
		setMenuBar(menuBar);//�޴��ٸ� �����ӿ� �߰��Ѵ�.
		
		Menu adminMenu = new Menu("����");
		menuBar.add(adminMenu);
		
		MenuItem boardMI = new MenuItem("�Խ���");
		//boardMI.setActionCommand("board");
		//boardMI.addActionListener(this);
		boardMI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("board.....");
				}
			});
		adminMenu.add(boardMI);
		
		MenuItem projectMI = new MenuItem("������Ʈ");
		//projectMI.setActionCommand("project");
	//	projectMI.addActionListener(this);
		projectMI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("project.....");
				}
			});
		adminMenu.add(projectMI);
		
		MenuItem contactMI = new MenuItem("����ó");
		//contactMI.setActionCommand("contact");
		//contactMI.addActionListener(this);
		contactMI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("contact.....");
				}
			});
		adminMenu.add(contactMI);
		
		MenuItem memberMI = new MenuItem("ȸ��");
		//memberMI.setActionCommand("member");
		//memberMI.addActionListener(this);
		memberMI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("member.....");
				}
			});
		adminMenu.add(memberMI);
	}
	
	public static void main(String[] args) {
		MainApp1 app = new MainApp1();
		app.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}