package _03_PerformanceEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PerformanceEx {
	//1) OracleDriver 클래스 객체가 메모리에 Loading
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//시간을 재자
		
		long start;
		long end;
		
		//오라클 접속 변수
		Connection con = null;
		//사전에 Query문을 최적화 해놓고, 전송시 인자만 받아서 바로 전달
		//(속도가 상대적으로 더 빠르다)
		//(인자를 변수로 전달할 수 있어서 편하다.)
		PreparedStatement pstmt = null;
		
		//Query 문을 받아서 최적화 과정을 거쳐서 전송한다.
		//(속도가 느리다)
		//(인자를 문자열 + 연산으로 전달해야해서 불편하다)
		Statement stmt = null;
		
		try {
			//2)오라클 서버와 연결
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
					
			//파싱->최적화->오라클에 전송
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

















