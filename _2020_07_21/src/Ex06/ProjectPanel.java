package Ex06;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JOptionPane;

public class ProjectPanel extends Panel implements ActionListener{
	TextField ptitleTF;
	TextField pnumTF;
	TextField pdateTF;
	TextArea pgoalTF;
	TextField pmemberTF;
	TextField pOfficerTF;
	TextArea plistTA;
	TextField passwordTF;
	java.awt.List projectLST;
	Button addBtn;
	Button cancelBtn;
	Button deleteBtn;
	ProjectDao projectDao;
	
	public ProjectPanel() {
		
		projectDao = new ProjectDao();
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		Label label = new Label("프로젝트 화면");
		label.setPreferredSize(new Dimension(400,30));
		add(label);
		
		label = new Label("프로젝트목록");
		label.setPreferredSize(new Dimension(400,30));
		add(label);
		
		Panel rowPanel = new Panel(new BorderLayout());
		rowPanel.setPreferredSize(new Dimension(400,200));
		projectLST = new java.awt.List();
		projectLST.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.DESELECTED)
					return;
				loadForm((int)e.getItem());
			}
		});
		rowPanel.add(projectLST,BorderLayout.CENTER);
		add(rowPanel);
		
		label = new Label("프로젝트 입력/상세정보");
		label.setPreferredSize(new Dimension (400,30));
		add(label);
		
		rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
		label = new Label("프로젝트명");
		label.setPreferredSize(new Dimension(80,30));
		rowPanel.add(label);
		
		ptitleTF = new TextField();
		ptitleTF.setPreferredSize(new Dimension (300,30));
		rowPanel.add(ptitleTF);
		add(rowPanel);
		
		rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
		label = new Label("프로젝트 책임자");
		label.setPreferredSize(new Dimension (90,30));
		rowPanel.add(label);
		
		pOfficerTF = new TextField();
		pOfficerTF.setPreferredSize(new Dimension(80,30));
		rowPanel.add(pOfficerTF);
		add(rowPanel);
		
		label = new Label("프로젝트 기간");
		label.setPreferredSize(new Dimension (90,30));
		rowPanel.add(label);
		
		pdateTF = new TextField();
		pdateTF.setPreferredSize(new Dimension(80,30));
		rowPanel.add(pdateTF);
		add(rowPanel);
		
		rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
		label = new Label("참여인원");
		label.setPreferredSize(new Dimension (50,30));
		rowPanel.add(label);
		
		pnumTF = new TextField();
		pnumTF.setPreferredSize(new Dimension(80,30));
		rowPanel.add(pnumTF);
		add(rowPanel);
		
		label = new Label("구성원");
		label.setPreferredSize(new Dimension (50,30));
		rowPanel.add(label);
		
		pmemberTF = new TextField();
		pmemberTF.setPreferredSize(new Dimension(250,30));
		rowPanel.add(pmemberTF);
		add(rowPanel);
		
		rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
		label = new Label("프로젝트목표");
		label.setPreferredSize(new Dimension(100,30));
		add(label);

		
		pgoalTF  = new TextArea();
		pgoalTF.setPreferredSize(new Dimension(450,200));
		rowPanel.add(pgoalTF);
		add(rowPanel);
		
		rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
		label = new Label("암호");
		label.setPreferredSize(new Dimension (40,30));
		rowPanel.add(label);
		
		passwordTF = new TextField();
		passwordTF.setPreferredSize(new Dimension(350,30));
		passwordTF.setEchoChar('*');
		rowPanel.add(passwordTF);
		add(rowPanel);
		
		rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
		addBtn = new Button("등록");
		addBtn.addActionListener(this);
		rowPanel.add(addBtn);
		cancelBtn = new Button("취소");
		cancelBtn.addActionListener(this);
		rowPanel.add(cancelBtn);
		
		deleteBtn = new Button("삭제");
		deleteBtn.setEnabled(false);
		deleteBtn.addActionListener(this);
		rowPanel.add(deleteBtn);
		
		add(rowPanel);
		loadList();
		
		
	}
	private void loadForm(int no) {
		Project project = projectDao.selectOne(no);
		if(project ==null)
			return;
		ptitleTF.setText(project.ptitle);
		pOfficerTF.setText(project.pOfficer);
		pdateTF.setText(project.pdate);
		pnumTF.setText(project.pnum);
		pmemberTF.setText(project.pmember);
		pgoalTF.setText(project.pgoal);
		deleteBtn.setEnabled(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addBtn) {
			Project project = new Project();
			project.ptitle = ptitleTF.getText();
			project.pOfficer = pOfficerTF.getText();
			project.pdate = pdateTF.getText();
			project.pnum = pnumTF.getText();
			project.pmember = pmemberTF.getText();
			project.pgoal = pgoalTF.getText();
			projectDao.insert(project);
			loadList();
			cancelBtn.dispatchEvent(new ActionEvent(cancelBtn,
					ActionEvent.ACTION_PERFORMED,null));
		}else if(e.getSource()==cancelBtn) {
			cleanForm();
		}else if(e.getSource()==deleteBtn) {
			if(!checkAuth()) {
				JOptionPane.showMessageDialog(null, "암호가 맞지 않습니다.");
				return;
			}
			int answer = JOptionPane.showConfirmDialog(null,"정말삭제하시겠습니까?","삭제알림!",
					JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
			if(answer !=JOptionPane.YES_OPTION)
				return;
			projectDao.delete(projectLST.getSelectedIndex());
			cleanForm();
			loadList();
		}
		
	}
	private boolean checkAuth() {
		int selectedProjectNo = projectLST.getSelectedIndex();
		Project project = projectDao.selectOne(selectedProjectNo);
		if(project.password.equals(passwordTF.getText()))
			return true;
		return false;
	}
	private void cleanForm() {
		ptitleTF.getText();
		ptitleTF.setText("");
		pOfficerTF.getText();
		pOfficerTF.setText("");
		pdateTF.getText();
		pdateTF.setText("");
		pnumTF.getText();
		pnumTF.setText("");
		pmemberTF.getText();
		pmemberTF.setText("");
		pgoalTF.getText();
		pgoalTF.setText("");
		passwordTF.getText();
		passwordTF.setText("");
		deleteBtn.setEnabled(false);
	}
	private void loadList() {
		projectLST.removeAll();
		List<Project> projects = projectDao.selectList();
		for(Project project : projects)
			projectLST.add(
					project.ptitle+","+
					project.pOfficer+","+
					project.pdate+","+
					project.pnum+","+
					project.pmember+","+
					project.pgoal);
	}
}













