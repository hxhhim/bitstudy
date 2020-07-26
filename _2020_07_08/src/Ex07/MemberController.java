package Ex07;

import java.util.Scanner;

/*
 * �̸�,�̸���,��ȣ,ȸ��������
 * 
 * ���θ޴��ΰ���(main)
 * ȸ������(add)
 * ������(detail)
 * ��üȸ������(list)
 * ȸ����������(update)
 * ȸ��Ż��(delete)
 * 
 * �̸�?
 * �̸���?
 * ��ȣ?
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
					System.out.println("����Ҽ� ���� �޴��Դϴ�.");

				}
			}
	}
	
	public void add() {
		Member member = new Member();
		System.out.print("�̸���?");
		member.name = keyScanner.nextLine();
		System.out.print("�̸�����?");
		member.email = keyScanner.nextLine();
		System.out.print("��ȣ��?");
		member.password = keyScanner.nextLine();
		System.out.print("Ű��?");
		member.height = keyScanner.nextLine();
		System.out.print("������?");
		member.weight = keyScanner.nextLine();
		memberDao.insert(member);
	}
	public void detail() {
		System.out.println("ȸ����ȣ:");
		int no = Integer.parseInt(keyScanner.nextLine());
		
		if(no < 0 || no> Member.cnt) {
			System.out.println("�ش�Խù��� ����");
			return;
		}
		Member member = memberDao.selectOne(no-1);
		System.out.printf("ȸ����ȣ, %s\n",member.no);
		System.out.printf("�̸�, %s\n",member.name);
		System.out.printf("�̸���, %s\n",member.email);
		System.out.printf("��ȣ, %s\n",member.password);
		System.out.printf("������, %s\n",member.signedUpdate);
		System.out.printf("Ű, %s\n",member.height);
		System.out.printf("������, %s\n",member.weight);
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
		
		System.out.println("ȸ����ȣ:");
		int no = Integer.parseInt(keyScanner.nextLine());
		
		if(no <0|| no>Member.cnt) {
			System.out.println("�ش�ȸ�� ����");
			return;
		}
		Member member = memberDao.selectOne(no-1);
		Member member1 = new Member();
		member1 = member;
		System.out.printf("�̸�(%s)?",member.name);
		member1.name = keyScanner.nextLine();
		System.out.printf("�̸���(%s)?",member.email);
		member1.email = keyScanner.nextLine();
		System.out.print("�����Ͻðڽ��ϱ�?(y/n)");
		select = keyScanner.nextLine();
		if(select.contentEquals("y")) {
			memberDao.update(member1);
			System.out.println("�����Ͽ����ϴ�.");
		}
		Member.cnt--;
		
	}
	public void delete() {
		System.out.print("ȸ����ȣ:");
		int no = Integer.parseInt(keyScanner.nextLine());
		System.out.print("�����Ͻðڽ��ϱ�?(Y/n)");
		String answer = keyScanner.nextLine();
		if(answer.contentEquals("y")||answer.contentEquals("")||answer.contentEquals("Y")) {
			int count = memberDao.delete(no-1);
			if(count >0 ) {
				System.out.println("�����Ͽ����ϴ�.");
			}else {
				System.out.println("�ش�ȸ���� ����");
			}
		}else {
			System.out.println("��������Ͽ����ϴ�.");
		}
	}
	public void menu() {
		System.out.printf("[����>%s]\n",this.MemberName);
		System.out.println("1.�����޴��� �̵�(main)");
		System.out.println("2.ȸ���߰�(add)");
		System.out.println("3.ȸ��������(detail)");
		System.out.println("4.��üȸ������(list)");
		System.out.println("5.ȸ����������(update)");
		System.out.println("6.ȸ��Ż��(delete)");
		System.out.println("�޴��� ������ �ּ���.");
		
	}
	
}
