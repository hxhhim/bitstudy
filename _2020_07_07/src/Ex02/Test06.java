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
public class Test06 {
	public static void main(String[] args) {
		Contact[] contacts =new Contact[10];				
		int i =0;
					
		while(i<10) {
			contacts[i++] = Func.inputContact();
			if(Func.prompt())
				break;
		}
		for(int j= 0; j<i;j++) {
			Func.printContact(contacts[j]);
		}
			

		}
	


}

