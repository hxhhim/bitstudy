package ex_07_01;

import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		int retry;
		System.out.println("계절을 찾습니다.");
		do {
			int month;
				do {
					System.out.print("몇 월입니까?:");
					month = stdln.nextInt();
				}while(month<1 || month>12);
				
				if(month>= 3 && month <5)
					System.out.println("봄입니다.");
				else if(month >=6 && month <=8)
					System.out.println("여름입니다.");
				if(month >=9 && month <=11)
					System.out.println("가을입니다.");
				if(month ==12||month ==1||month==2)
					System.out.println("겨울입니다.");
				System.out.print("다시 하겠습니까? 1...yes/0...No:");
				retry =  stdln.nextInt();
				
		}while (retry ==1);	

	}

}
