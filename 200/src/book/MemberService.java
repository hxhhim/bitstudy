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
			System.out.println("�α׾ƿ��Ǿ����ϴ�.");
		}else {
			System.out.println("id�� �ٽ��Է��ϼ���.");
		}
	}
}
