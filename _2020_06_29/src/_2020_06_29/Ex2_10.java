package _2020_06_29;

import java.util.Scanner;

public class Ex2_10 {

	public static void main(String[] args) {
		double r = 0, vol =0,area = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� �Է��ϼ���:");
		r = sc.nextInt();
		vol = 4/3f*Math.PI*r*r*r;
		area = 4*Math.PI*r*r;
		System.out.printf("���� ���Ǵ�:%.2f\n",vol);
		System.out.printf("���� �ѳ��̴�:%.2f\n",area);
	}

}
