package _02_JDBC_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * SQL ���� ����ϴ� 3���� ������ Ŭ����
 * Statement  :�⺻
 * PreparedStatement extends Statement :�ӵ����, �������� ��
 * CallableStatement extends PreparedStatement :Ʈ����, ���μ���
 */

//statement�� ��������� SQL���� �Ľ�, ����ȭ, ������ �Ѵ�.
//preparedStatement�� ������ �̸� SQL���� �Ľ�, ����ȭ �ϰ� 
//��������� ���޸� �Ѵ�.
//�׷��� preparedStatement�� �ӵ��� �� ������.
//������ ���߿� �����ϹǷ� �ſ� ���ϴ�.
public class jdbcPreParedStatement {
	//1)oracleDriver Ŭ������ ��üȭ�Ѵ�.
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void main (String [] args) {
		//2)Ŭ���� ���� �غ�
		Connection con = null; 			//����Ŭ ���� ����
		PreparedStatement pstmt = null; //SQL�� ����
		ResultSet rs = null;			//SELECT���� ��� �� �����
	
		try {
			//3)����Ŭ ������ ����
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"st",
					"1234");
			StringBuffer sb = new StringBuffer();
			int uCount = 0;
			
			//4) aaa���̺��� �ִٸ� ����
			try {
				sb.setLength(0);
				sb.append("DROP TABLE aaa");
				pstmt = con.prepareStatement(sb.toString());
				uCount = pstmt.executeUpdate();
				System.out.println(sb.toString());
				System.out.println("DROP COUNT: "+uCount);
				
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
			//5)aaa ���̺� ����
			sb.setLength(0);
			sb.append("CREATE TABLE aaa(id VARCHAR2(10), ");
			sb.append("password VARCHAR2(10))");
			pstmt = con.prepareStatement(sb.toString());
			uCount = pstmt.executeUpdate();
			System.out.println(sb.toString());
			System.out.println("CREATE COUNT: "+uCount);
			
			//6)������ �Է�
			sb.setLength(0);
			sb.append("INSERT INTO aaa VALUES(?,?)"); //�Է°� ����?
			pstmt = con.prepareStatement(sb.toString());
			pstmt.setString(1,"chicken");
			pstmt.setString(2,"baseball");
			uCount = pstmt.executeUpdate();
			System.out.println(sb.toString());
			System.out.println("INSERT COUNT: "+ uCount);
			
			//7)������ �˻�
			sb.setLength(0);
			sb.append("SELECT * FROM aaa");
			pstmt = con.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			System.out.println(sb.toString());
			while(rs.next()) {
				System.out.println("id: "+rs.getString(1));
				System.out.println(", password: "+rs.getString(2));
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {if(rs!=null)rs.close();}catch(Exception e) {}
			try {if(pstmt != null)pstmt.close();}catch(Exception e) {}
			try {if(con != null)con.close();}catch(Exception e) {}
		}
	}
}





















