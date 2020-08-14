package dao;

import static db.jdbcUtil.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import vo.Member;

public class MemberDAO {
	Connection con;
	
	public MemberDAO(Connection con) {
		this.con = con;
	}
	
	public int insertNewMember(Member newMember) {
		int insertCount = 0;
		PreparedStatement pstmt = null;
		
		String sql="INSERT INTO member VALUES(member_id_seq.nextval,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, newMember.getName());
			pstmt.setString(2, newMember.getAddr());
			pstmt.setString(3, newMember.getNation());
			pstmt.setString(4, newMember.getEmail());
			pstmt.setInt(5, newMember.getAge());
			insertCount = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)
					close(pstmt);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
				
		
		return insertCount;
	}
	public void deleteMember() throws SQLException {
		Scanner sc = new Scanner(System.in);
		PreparedStatement pstmt = null;
		StringBuffer sb = new StringBuffer();
		sb.setLength(0);
		sb.append("DELETE FROM member WHERE id='?'");
		String del = sc.nextLine();
		pstmt.executeUpdate(sb.toString());
	}
	public void listMember(Connection con)  {
		
		ResultSet rs = null;
		Statement stmt = null;
		StringBuffer sb = new StringBuffer();
		sb.setLength(0);
		sb.append("SELECT * FROM member");
		try {
		rs=stmt.executeQuery(sb.toString());
		while(rs.next()) {
			System.out.println(rs.toString());
		}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
