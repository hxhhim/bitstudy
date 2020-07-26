package _2020_06_29;

import java.util.Random;

public class Ex2_11 {

	public static void main(String[] args) {
		Random rd = new Random();
		int num0 = rd.nextInt(9);
		System.out.println("한자리 양의 랜덤값은:"+(num0+1));
		int num1 = rd.nextInt(9);
		System.out.println("한자리 음의 랜덤값은:"+ -(num1+1));
		int num2 = rd.nextInt(90); 		
		System.out.println("두자리 양의 랜덤값은:"+(num2+10));
		

	}

}
