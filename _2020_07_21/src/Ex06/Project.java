package Ex06;

import java.io.Serializable;

/*
 * ������Ʈ �̸�
 * �����ο�
 * ������Ʈ �Ⱓ
 * ������Ʈ ��ǥ
 * �������� å����
 * 
 */
public class Project implements Serializable{
	
	int no;
	String ptitle;      //������Ʈ �̸�
	String pnum;		    //�����ο�		
	String pdate;	    //������Ʈ�Ⱓ
	String pgoal;       //������Ʈ��ǥ
	String pOfficer;    //������Ʈ å����
	String pmember;	    //������Ʈ ������
	String password;	//��й�ȣ
	
	public Project() {
		this.no =1;
		this.ptitle = "������Ʈ �̸�";
		this.pnum = "5";
		this.pdate = "60��";
		this.pgoal = "Ȩ����������";
		this.password = "1111";
	}
	public Project(String ptitle,String pnum, String pgoal,String pdate
			,String pOfficer,String pmember,String password) {
		this();
		this.ptitle = ptitle;
		this.pOfficer = pOfficer;
		this.pmember = pmember;
		this.pnum = pnum;
		this.pgoal = pgoal;
		this.pdate = pdate;
		this.password = "1111";
	}

}
















