package svc;

import static db.jdbcUtil.commit;
import static db.jdbcUtil.getConnection;
import static db.jdbcUtil.rollback;

import java.sql.Connection;

import dao.MemberDAO;
import vo.Member;

public class MemberDeleteService {

	public boolean delMember(int delId) {
		boolean delIdSuccess = false;
		Connection con = getConnection();
		MemberDAO memberDAO = new MemberDAO(con);
		
		int delCount = memberDAO.deleteMember(delId);
		if(delCount>0) {
			commit(con);
			delIdSuccess= true;
		}else {
			rollback(con);
		}
		return delIdSuccess;
	}
	
}
