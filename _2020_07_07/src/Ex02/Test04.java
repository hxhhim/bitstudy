package Ex02;

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
public class Test04 {

	public static void main(String[] args) {
		Scanner keyScanner = new Scanner(System.in);
		
		Contact[] contacts =new Contact[10];
		int i =0;
		
		Contact contact;
		String answer;
		
		while(i<10) {
			contact = new Contact();
			
			System.out.print("이름?");
			contact.name = keyScanner.nextLine();
			System.out.print("전화?");
			contact.phone = keyScanner.nextLine();
			System.out.print("이메일?");
			contact.email = keyScanner.nextLine();
			System.out.print("직위?");
			contact.rank = keyScanner.nextLine();
			
			contacts[i] = contact;
			i++;
			
			System.out.print("계속입력하시겠습니까?(y/n)");
			answer = keyScanner.nextLine();
			if(answer.equals("n"))
				break;
		}
		for(int j= 0; j<i;j++) {
			System.out.print(contacts[j].name+" "+contacts[j].phone+" "+contacts[j].email+" "+contacts[j].company+" "+contacts[j].rank);
			System.out.println();
		}
		keyScanner.close();
		
	}

}
