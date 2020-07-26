package Ex07;

import java.util.Scanner;

/*
 * 이름,이메일,암호,회원가입일
 * 
 * 메인메뉴로가기(main)
 * 회원가입(add)
 * 상세정보(detail)
 * 전체회원보기(list)
 * 회원정보변경(update)
 * 회원탈퇴(delete)
 * 
 * 이름?
 * 이메일?
 * 암호?
 * 
 *
 */
public class MemberController {
	static Scanner keyScanner ;
	
	MemberDao memberDao = new MemberDao();
	int i = 0;
	int j = 0;
	String MemberName;
	
	public MemberController(String MemberName) {
		this.MemberName = MemberName;
	}
	
	public void service() {
			String command;
			label1:
			while(true) {
				
				menu();
				command = keyScanner.nextLine();
				switch (command) {
				case "main":
					break label1;
				case "add":
					add();
					break;
				case "detail":
					detail();
					break;
				case "list":
					list();
					break;
				case "update":
					update();
					break;
				case "delete":
					delete();
					break;
				default:
					System.out.println("사용할수 없는 메뉴입니다.");

				}
			}
	}
	
	public void add() {
		Member member = new Member();
		System.out.print("이름은?");
		member.name = keyScanner.nextLine();
		System.out.print("이메일은?");
		member.email = keyScanner.nextLine();
		System.out.print("암호는?");
		member.password = keyScanner.nextLine();
		System.out.print("키는?");
		member.height = keyScanner.nextLine();
		System.out.print("몸무게?");
		member.weight = keyScanner.nextLine();
		memberDao.insert(member);
	}
	public void detail() {
		System.out.println("회원번호:");
		int no = Integer.parseInt(keyScanner.nextLine());
		
		if(no < 0 || no> Member.cnt) {
			System.out.println("해당게시물이 없음");
			return;
		}
		Member member = memberDao.selectOne(no-1);
		System.out.printf("회원번호, %s\n",member.no);
		System.out.printf("이름, %s\n",member.name);
		System.out.printf("이메일, %s\n",member.email);
		System.out.printf("암호, %s\n",member.password);
		System.out.printf("가입일, %s\n",member.signedUpdate);
		System.out.printf("키, %s\n",member.height);
		System.out.printf("몸무게, %s\n",member.weight);
	}
	public void list() {
		Member[] members = memberDao.selectList();
		
		for(int x = 0; x<members.length; x++) {
			System.out.print(members[x].no+", ");
			System.out.print(members[x].name+", ");
			System.out.print(members[x].email+", ");
			System.out.print(members[x].password+", ");
			System.out.print(members[x].signedUpdate+", ");
			System.out.print(members[x].height+"cm, ");
			System.out.println(members[x].weight+"kg");
			
		}
	}
	public void update() {
		String select;
		
		System.out.println("회원번호:");
		int no = Integer.parseInt(keyScanner.nextLine());
		
		if(no <0|| no>Member.cnt) {
			System.out.println("해당회원 없음");
			return;
		}
		Member member = memberDao.selectOne(no-1);
		Member member1 = new Member();
		member1 = member;
		System.out.printf("이름(%s)?",member.name);
		member1.name = keyScanner.nextLine();
		System.out.printf("이메일(%s)?",member.email);
		member1.email = keyScanner.nextLine();
		System.out.print("변경하시겠습니까?(y/n)");
		select = keyScanner.nextLine();
		if(select.contentEquals("y")) {
			memberDao.update(member1);
			System.out.println("변경하였습니다.");
		}
		Member.cnt--;
		
	}
	public void delete() {
		System.out.print("회원번호:");
		int no = Integer.parseInt(keyScanner.nextLine());
		System.out.print("삭제하시겠습니까?(Y/n)");
		String answer = keyScanner.nextLine();
		if(answer.contentEquals("y")||answer.contentEquals("")||answer.contentEquals("Y")) {
			int count = memberDao.delete(no-1);
			if(count >0 ) {
				System.out.println("삭제하였습니다.");
			}else {
				System.out.println("해당회원이 없음");
			}
		}else {
			System.out.println("삭제취소하였습니다.");
		}
	}
	public void menu() {
		System.out.printf("[메인>%s]\n",this.MemberName);
		System.out.println("1.상위메뉴로 이동(main)");
		System.out.println("2.회원추가(add)");
		System.out.println("3.회원상세정보(detail)");
		System.out.println("4.전체회원보기(list)");
		System.out.println("5.회원정보변경(update)");
		System.out.println("6.회원탈퇴(delete)");
		System.out.println("메뉴를 선택해 주세요.");
		
	}
	
}
