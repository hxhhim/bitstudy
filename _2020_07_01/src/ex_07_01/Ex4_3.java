package ex_07_01;

import java.util.Random;
import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdln = new Scanner(System.in);
		int no = 10 + rand.nextInt(90);
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요.");
		int x;
		do {
			System.out.print("어떤 숫자일까:");
			 x = stdln.nextInt();
			 
			 if(x>no)
				 System.out.println("더 작은 숫자 입니다.");
			 else if(x < no)
				 System.out.println("더 큰 숫자입니다.");
		}while(x!= no);
		System.out.print("정답입니다.");
			 
		}
		
		
		

	}


