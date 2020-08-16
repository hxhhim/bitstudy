package svc;

import static db.jdbcUtil.getConnection;
import static db.jdbcUtil.commit;
import static db.jdbcUtil.rollback;
import java.sql.Connection;

import dao.MemberDAO;
import vo.Member;

public class MemberUpdateService {
	public boolean upMember(Member newMember,int updateId) {
		boolean upIdSuccess = false;
		Connection con = getConnection();
		MemberDAO memberDAO = new MemberDAO(con);
		
		int upCount = memberDAO.updateMember(newMember, updateId);
		if(upCount>0) {
			commit(con);
			upIdSuccess = true;
		}else {
			rollback(con);
		}
		return upIdSuccess;
	}
}
