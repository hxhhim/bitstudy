package Ex06;

import java.io.Serializable;

/*
 * 프로젝트 이름
 * 참여인원
 * 프로젝트 기간
 * 프로젝트 목표
 * 구성원과 책임자
 * 
 */
public class Project implements Serializable{
	
	int no;
	String ptitle;      //프로젝트 이름
	String pnum;		    //참여인원		
	String pdate;	    //프로젝트기간
	String pgoal;       //프로젝트목표
	String pOfficer;    //프로젝트 책임자
	String pmember;	    //프로젝트 구성원
	String password;	//비밀번호
	
	public Project() {
		this.no =1;
		this.ptitle = "프로젝트 이름";
		this.pnum = "5";
		this.pdate = "60일";
		this.pgoal = "홈페이지제작";
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
















