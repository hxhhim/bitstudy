package edu.exam02.Ex;

import java.util.Random;

public class Ex3_11 {

	public static void main(String[] args) {
		Random rd = new Random();
		double num = rd.nextDouble();
		double num1 = rd.nextDouble();
		System.out.println("ù���� �Ǽ���:"+num);
		System.out.println("�ι��� �Ǽ���:"+num1);
		
/*		if(num>num1) {
			System.out.println(num+"�� �� Ů�ϴ�.");
		}else {
			System.out.println(num1+"�� �� Ů�ϴ�.");
		}*/
		
		double max;
		
		if(num>num1)
			max =num;
		else
			max =num1;
		System.out.println("ū ���� ����"+max+"�Դϴ�.");
/*
 * 		double max = num>num1 ? num: num1;
 * 		System.out.println("ū ���� ����"+max+"�Դϴ�.");
 * 		���׿����� ���		
 */
	}

}
