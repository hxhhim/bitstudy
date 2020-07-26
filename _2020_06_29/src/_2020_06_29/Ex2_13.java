package _2020_06_29;

import java.util.Random;

public class Ex2_13 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		double num = rd.nextDouble();
		System.out.printf("·£´ý°ªÀº:%.5f\n",num);
		double num1 = rd.nextDouble();
		System.out.printf("·£´ý°ªÀº:%.5f\n",(num1*10));
		double num2 = rd.nextDouble();
		System.out.printf("·£´ý°ªÀº:%.5f\n",(num2*2-1));
	}

}
