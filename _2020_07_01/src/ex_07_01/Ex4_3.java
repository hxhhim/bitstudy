package ex_07_01;

import java.util.Random;
import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdln = new Scanner(System.in);
		int no = 10 + rand.nextInt(90);
		System.out.println("���� ���߱� ���� ����!");
		System.out.println("10���� 99������ ���ڸ� ���߼���.");
		int x;
		do {
			System.out.print("� �����ϱ�:");
			 x = stdln.nextInt();
			 
			 if(x>no)
				 System.out.println("�� ���� ���� �Դϴ�.");
			 else if(x < no)
				 System.out.println("�� ū �����Դϴ�.");
		}while(x!= no);
		System.out.print("�����Դϴ�.");
			 
		}
		
		
		

	}


