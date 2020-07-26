package Ex07;

import java.util.Scanner;

/*
 * 이름?홍길동
 * 전화?010-1111-1111
 * 이메일?hong@test.com
 * 회사?비트캠프
 * 직위?대리
 * 계속입력하시겠습니까?(y/n)
 * --------------------
 * 이름?임꺽정
 * 전화?010-222-3333
 * 이메일?lim@test.com
 * 회사?비트캠프
 * 직위?사원
 */
public class ContactController {
	static Scanner keyScanner ;
	Contact[] contacts =new Contact[10];				
	int i =0;
	int j =0;
	String contactName;
	
	public ContactController(String contactName) {//생성자 String contactName으로 외부에서 받아서
		this.contactName = contactName;			//게시판마다 이름을 구별하기위해서
	}
	public void service() {
					
		while(true) {
			System.out.printf("[메인>%s\n",this.contactName);
			inputContact();
			if(prompt())
				break;
		}
		System.out.printf("[메인>%s\n",this.contactName);
		for( j= 0; j<i;j++) {
			printContact();
		}
			

		}
	public void inputContact() {
		Contact contact = new Contact();
//		System.out.println("[메인>연락처]");
		System.out.print("이름?");
		contact.name = keyScanner.nextLine();
		System.out.print("전화?");
		contact.phone = keyScanner.nextLine();
		System.out.print("이메일?");
		contact.email = keyScanner.nextLine();
		System.out.print("직위?");
		contact.rank = keyScanner.nextLine();
		contacts[i++]=contact;
	}
	static boolean prompt() {
		System.out.print("계속입력하시겠습니까?(y/n)");
		String answer = keyScanner.nextLine();
		if(answer.equals("n"))
			return true;
		return false;
	}
	public void printContact() {
		System.out.print(contacts[j].name+" "+contacts[j].phone+" "+contacts[j].email+" "+contacts[j].company+" "+contacts[j].rank);
		System.out.println();
	}


}

