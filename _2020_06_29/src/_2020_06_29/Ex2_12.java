package _2020_06_29;

import java.util.Random;
import java.util.Scanner;

public class Ex2_12 {

	public static void main(String[] args) {
		int num = 0, num1= 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���:");		
		num = sc.nextInt();
		num1 = num - 5;
		Random rd = new Random();
		int num2 = rd.nextInt(9);
		System.out.println("��������:"+(num2+num1));
		
				
	}

}
