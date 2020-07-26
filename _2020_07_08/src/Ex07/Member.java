package Ex07;

public class Member {
	static int cnt=0;
	int no;
	String name;
	String email;
	String password;
	String signedUpdate;
	String weight;
	String height;
	
	
	
	public Member() {
		cnt++;
		this.no = cnt;
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		String str = today.toString();
		this.signedUpdate = str;
		
		
	}
	public Member(String name, String email, String password) {
		
		
		cnt++;
		this.no = cnt;
		this.name = name;
		this.email = email;
		this.password = password;
	}
}
