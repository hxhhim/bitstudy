package svc;

import java.sql.Connection;
import static db.jdbcUtil.*;
import dao.MemberDAO;

public class MemberListService {
	public void listMember() {
		Connection con =getConnection();
		MemberDAO memberDAO = new MemberDAO(con);
		
		memberDAO.listMember(con);
		
		
	}
}
