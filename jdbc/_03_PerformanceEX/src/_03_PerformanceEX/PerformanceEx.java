package _03_PerformanceEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PerformanceEx {
	//1) OracleDriver Ŭ���� ��ü�� �޸𸮿� Loading
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//�ð��� ����
		
		long start;
		long end;
		
		//����Ŭ ���� ����
		Connection con = null;
		//������ Query���� ����ȭ �س���, ���۽� ���ڸ� �޾Ƽ� �ٷ� ����
		//(�ӵ��� ��������� �� ������)
		//(���ڸ� ������ ������ �� �־ ���ϴ�.)
		PreparedStatement pstmt = null;
		
		//Query ���� �޾Ƽ� ����ȭ ������ ���ļ� �����Ѵ�.
		//(�ӵ��� ������)
		//(���ڸ� ���ڿ� + �������� �����ؾ��ؼ� �����ϴ�)
		Statement stmt = null;
		
		try {
			//2)����Ŭ ������ ����
			con = DriverManager.getConnection(
										//localhost= 127.0.0.1
					"jdbc:oracle:thin:@127.0.0.1:1521:xe",
					"st",
					"1234");
			stmt = con.createStatement();
			
			try {
				stmt.executeUpdate("DROP TABLE performance");
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			String sql = "CREATE TABLE performance(id varchar2(10),"+
						"password varchar2(10))";
					
			//�Ľ�->����ȭ->����Ŭ�� ����
			stmt.executeUpdate(sql);
			start = System.currentTimeMillis();
			for(int i=0;i<10000;i++){
					stmt.executeUpdate("INSERT INTO performance values"
							+"('"+"','"+i+"')");
					
		}
			end = System.currentTimeMillis();
			System.out.println("Statement process time = "+(end-start));
			sql = "INSERT INTO performance values(?,?)";
			pstmt = con.prepareStatement(sql);
			
			start = System.currentTimeMillis();
			for(int j=0;j<10000;j++) {
				pstmt.setString(1, ""+j);
				pstmt.setString(2, ""+j);
				pstmt.executeUpdate();
							
			}
			end = System.currentTimeMillis();
			System.out.println("PreparedStatement process time = " + (end-start));
			
					
				
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			if(pstmt !=null)pstmt.close();
			if(stmt !=null)stmt.close();
			if(con !=null)con.close();
			
		}catch(SQLException e) {}
	}
}


}

















