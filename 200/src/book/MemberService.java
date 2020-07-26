package book;

public class MemberService {
	public boolean login(String id, String password) {
		if(id.equals("hong")) {
			if(password.equals("12345")) {
				return true;
			}return false;
		}return false;
		
	}
	public void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("로그아웃되었습니다.");
		}else {
			System.out.println("id를 다시입력하세요.");
		}
	}
}
