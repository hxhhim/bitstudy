package _2020_06_29;

import java.util.Scanner;

public class Ex2_6 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		num = sc.nextInt();
		
		System.out.println("입력한 숫자에 10을 더하면:"+(num+10)+"입니다");
		System.out.println("입력한 숫자에서 10을 빼면:"+(num-10)+"입니다");
	}

}
