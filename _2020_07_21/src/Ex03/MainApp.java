package Ex03;

import java.awt.BorderLayout;
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
	BoardPanel boardPanel;
	ProjectPanel projectPanel;
	MemberPanel memberPanel;
	ContactPanel contactPanel;
	Panel currPanel;
	public MainApp() {
		super("��Ʈķ��");
		boardPanel = new BoardPanel();
		projectPanel = new ProjectPanel();
		memberPanel = new MemberPanel();
		contactPanel = new ContactPanel();
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
	@Override
	public void actionPerformed(ActionEvent e) {
		Panel selectedPanel = null;
		
		switch(e.getActionCommand()) {
		case"board":
			selectedPanel = boardPanel; break;
		case"project":
			selectedPanel = projectPanel; break;
		case"contact":
			selectedPanel = contactPanel; break;
		case"member":
			selectedPanel = memberPanel; break;
		}
		if(currPanel != selectedPanel) {
			if(currPanel != null) {
				remove(currPanel);
			}
			add(selectedPanel,BorderLayout.CENTER);
			currPanel = selectedPanel;
			revalidate();
		}
		
	}

}