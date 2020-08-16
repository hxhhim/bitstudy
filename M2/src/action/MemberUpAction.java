package action;

import java.util.Scanner;

import svc.MemberUpdateService;
import util.ConsoleUtil;
import vo.Member;

public class MemberUpAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil cu = new ConsoleUtil();
		int upid = cu.updateId(sc);
		Member newMember = cu.getupMember(sc);
		
		MemberUpdateService  memberUpdateService = new MemberUpdateService();
		
		boolean isupSuccess = memberUpdateService.upMember(newMember, upid);
		if(isupSuccess) {
			System.out.println(newMember.getName()+"회원정보 수정 성공");
		}else {
			System.out.println(newMember.getName()+"회원정보 수정 실패");
		}

	}

}
