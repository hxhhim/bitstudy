package Ex05;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainApp extends Frame implements ActionListener{
	BoardPanel boardPanel= new BoardPanel();
	ProjectPanel projectPanel= new ProjectPanel();
	MemberPanel memberPanel= new MemberPanel();
	ContactPanel contactPanel= new ContactPanel();
	Panel currPanel;
	CardLayout cardLayout = new CardLayout();
	public MainApp() {
		super("��Ʈķ��");
		setLayout(cardLayout);
		prepareMenu();
		preparePanels();
		
		//1)�������� �ݱ� ��ư �̺�Ʈ�� ó���� �����ʵ��
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//2)������ ũ�� ����
		setSize(500,600);
	}
	private void prepareMenu() {
		MenuBar menuBar = new MenuBar();
		setMenuBar(menuBar);//�޴��ٸ� �����ӿ� �߰��Ѵ�.
		
		Menu adminMenu = new Menu("����");
		menuBar.add(adminMenu);
		
		MenuItem boardMI = new MenuItem("�Խ���");
		boardMI.setActionCommand("board");//���߿� �̺�Ʈ�� ������ �� ����ϱ� ����
		boardMI.addActionListener(this);//MainApp �ڽ��� ActionListener�� �����ߴ�.
		adminMenu.add(boardMI);//�Խ��� �޴��� �����޴��� �߰��Ѵ�.
		
		MenuItem projectMI = new MenuItem("������Ʈ");
		projectMI.setActionCommand("project");
		projectMI.addActionListener(this);
		adminMenu.add(projectMI);
		
		MenuItem contactMI = new MenuItem("����ó");
		contactMI.setActionCommand("contact");
		contactMI.addActionListener(this);
		adminMenu.add(contactMI);
		
		MenuItem memberMI = new MenuItem("ȸ��");
		memberMI.setActionCommand("member");
		memberMI.addActionListener(this);
		adminMenu.add(memberMI);
	}
	
	public static void main(String[] args) {
		MainApp app = new MainApp();
		app.setVisible(true);

	}
	private void preparePanels() {
		add(boardPanel, "board");
		add(projectPanel,"project");
		add(memberPanel, "member");
		add(contactPanel, "contact");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		cardLayout.show(this, e.getActionCommand());
		revalidate();
	}
	

}