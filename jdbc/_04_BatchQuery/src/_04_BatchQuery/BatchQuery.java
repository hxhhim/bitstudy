package _04_BatchQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * executeUpdate : DML(INSERT,UPDATE,DELETE)
 * executeQuery : SELECT
 * 만약 사용자로 부터 직접 Query를 입력받을 경우는
 * 어떤 종류의 문자인지 알수가 없다.
 * 이럴때는 execute를 사용한다.
 * 반환값이 true면 SELECT문
 * false면 DDL,DML 문
 * String sql = sc.next();
 * if(stmt.execute(sql)){
 * 	rs = stmt.getResultSet();//SELECT문
 * }else{
 * uCount = stmt.getUpdateCount(); //몇개 행 적용
 * } 
 *
 */
public class BatchQuery {
	static {
		//1) 패키지 클래스 경로를 문자열 전달해서 객체 생성
		try {
//			oracle.jdbc.driver.OracleDriver oraDriver = 
//					new oracle.jdbc.driver.OracleDriver();
//			DriverManager.registerDriver(oraDriver);
		
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());//익명개체 사용
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//2)객체 변수 선언
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		boolean isCommit = false;
		
		try {
			//3)오라클 서버 접속
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"st",
					"1234");
			if(con != null)
				System.out.println("Oracle Server 연결 성공!");
			
			//4)Query 문 전송객체 생성
			
			stmt = con.createStatement();
			
			//5) 만일 test4테이블이 있다면 삭제
			try {
				stmt.executeUpdate("DROP TABLE test4");
				
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
			//6)test4 테이블 생성
			stmt.executeUpdate("CREATE TABLE test4("+
					"id VARCHAR2(10), "+"password VARCHAR2(10))");
			
			//7)여러개의 쿼리를 담아서 한번에 전송하자.
			//배치 쿼리
			//원래 JDBC의 기본설정은 자동 커밋이다.
			//배치쿼리를 하기위해서 수동 커밋으로 변경한다.
			/*
			 * JDBC는 DML문장을 실행할 때 자동으로 커밋한다.
			 * 그러나 배치쿼리같이 일련의 과정의 실행이
			 * 모두 보장되어야 하는 경우, 
			 * 만일 중간에서 에러가 발생하면 실행된 부분까지
			 * 이미 커밋처리가 되기때문에 Rollback을 하지 못해서
			 * 문제가 발생할 수 있다.
			 * 이럴경우는 차라리 트랜잭션이 완료시 수동으로 커밋을 처리하는것이 바람직하다.
			 */
			con.setAutoCommit(false);
			//Query문들을 닫는다.
			stmt.addBatch("INSERT INTO test4" +"\r\n"+"VALUES('aaa000','0000')");
			stmt.addBatch("INSERT INTO test4" +"\r\n"+"VALUES('bbb111','1111')");
			stmt.addBatch("INSERT INTO test4" +"\r\n"+"VALUES('ccc222','2222')");
			stmt.addBatch("INSERT INTO test4" +"\r\n"+"VALUES('ddd333','3333')");
			
			//Oracle Server로 한번에 전송
			try {
				int [] uCounts = stmt.executeBatch();
				for(int i=0;i<uCounts.length;i++) {
					System.out.println(i+1+"번째 Query"+uCounts[i]+"행 적용");
				}
				
			}catch(SQLException e) {
				con.rollback();
				e.printStackTrace();
				
			}
			con.commit();
			isCommit = true;
			con.setAutoCommit(true);
			rs = stmt.executeQuery("SELECT * FROM test4");
			while(rs.next()) {
				String id = rs.getString("id");
				String password = rs.getString("password");
				System.out.println("id: "+id+", "+ "password: "+password);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
				if(con != null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
