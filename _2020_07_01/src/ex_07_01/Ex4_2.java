package ex_07_01;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {

		Scanner stdln = new Scanner(System.in);
		int x;
		do {
			System.out.println("세자리 정수값:");
				x = stdln.nextInt();
		}while(x<100||x>999);
		System.out.print("입력한 값은 " + x +"입니다.");
		}
/*		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int num = sc.nextInt();
		if(num<100) {
			System.out.println("다시입력하세요:");
		}
		else if(num>999) {
			System.out.println("다시입력하세요:");
		}else
			System.out.println("3자리양의정수를 입력하였습니다.");
			
		sc.close();
*/	}


//다시 입력하세요 후에 다시 if문으로 돌아가는것 찾아볼것