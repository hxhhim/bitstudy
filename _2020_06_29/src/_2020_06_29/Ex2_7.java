package _2020_06_29;

import java.util.Scanner;

public class Ex2_7 {
public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		num = sc.nextInt();
		int x = 0, y = 0;
		x = num/10*10;
		y = num%10;
		System.out.println("입력한 숫자에서 마지막 자리수를 빼면:"+ x +"입니다");
		System.out.println("입력한 숫자에서 마지막 자리수는 :"+ y +"입니다");
	}
}
