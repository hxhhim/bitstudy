package _2020_06_29;

import java.util.Scanner;

public class Ex2_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사시는곳의 도시이름을 입력해주세요:");
		String str = sc.next();
		System.out.println("사시는곳의 구를 입력해주세요:");
		String str1 = sc.next();
		System.out.println("사시는곳의 동를 입력해주세요:");
		String str2 = sc.next();
		System.out.println("사시는곳의 나머지 주소를 입력해주세요:");
		String str3 = sc.next();
		System.out.println("입력하신 주소는 "+str+" "+str1+" "+str2+" "+str3+"입니다");

	}

}
