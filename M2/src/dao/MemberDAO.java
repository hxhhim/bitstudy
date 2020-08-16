package dao;

import static db.jdbcUtil.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.ConsoleUtil;
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
	public int deleteMember(int delId) {
		int delCount = 0;
		PreparedStatement pstmt = null;
		
		
		
		String sql="DELETE FROM member WHERE id=?";
		try {
			pstmt= con.prepareStatement(sql);
			pstmt.setInt(1,delId);
			delCount=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt !=null)
					close(pstmt);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return delCount;
	}
	
	public void listMember(Connection con)  {
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		String sql ="SELECT * FROM member";
		try {
		pstmt=con.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String addr = rs.getString(3);
			String nation = rs.getString(4);
			String email = rs.getString(5);
			int age = rs.getInt(6);
			Member newMember= new Member(name,addr,nation,email,age);
			System.out.println("id: "+id+" "+newMember);
		}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public int updateMember(Member newMember,int updateId) {
		int updateCount = 0;
		PreparedStatement pstmt = null;
			
		
		String sql="UPDATE member SET id=?,name=?,addr=?,nation=?,email=?,age=? WHERE id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, updateId);
			pstmt.setString(2, newMember.getName());
			pstmt.setString(3, newMember.getAddr());
			pstmt.setString(4, newMember.getNation());
			pstmt.setString(5, newMember.getEmail());
			pstmt.setInt(6, newMember.getAge());
			pstmt.setInt(7, updateId);
			updateCount = pstmt.executeUpdate();
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
				
		return updateCount;
	}
}
