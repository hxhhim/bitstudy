package edu.exam02.Ex;

import java.util.Random;

public class Ex3_12 {

	public static void main(String[] args) {
		Random rd = new Random();
		int num = rd.nextInt();
		int num1 = rd.nextInt();
		System.out.println("ù���� ������:"+num);
		System.out.println("�ι��� ������:"+num1);
		System.out.println("���������� ����:"+(num-num1));
//num�� Ŭ ��츸 �۵�
/*
 * 		int diff;
 * 		if(num>=num1)
 * 			diff = num-num1;
 * 		else
 * 		   diff = num1-num;
 * 		System.out.println("�ΰ��� ���� "+diff +"�Դϴ�.");
 * 
 */// ���׿����ڻ��
  		int diff = num>= num1?num-num1:num1-num;
  		System.out.println("�ΰ��� ���� "+diff +"�Դϴ�.");
 
		
	}

}
