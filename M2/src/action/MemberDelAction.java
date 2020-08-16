package action;

import java.util.Scanner;

import svc.MemberDeleteService;
import util.ConsoleUtil;

public class MemberDelAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil cu = new ConsoleUtil();
		int delId = cu.getDeleteId(sc);
		
		MemberDeleteService  memberDelService = new MemberDeleteService();
		
		boolean isdelSuccess = memberDelService.delMember(delId);
		if(isdelSuccess) {
			System.out.println(delId+"회원정보 삭제 성공");
		}else {
			System.out.println(delId+"회원정보 삭제 실패");
		}

	}

}
