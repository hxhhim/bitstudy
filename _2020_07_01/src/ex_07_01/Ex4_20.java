package ex_07_01;

import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		int retry;
		System.out.println("������ ã���ϴ�.");
		do {
			int month;
				do {
					System.out.print("�� ���Դϱ�?:");
					month = stdln.nextInt();
				}while(month<1 || month>12);
				
				if(month>= 3 && month <5)
					System.out.println("���Դϴ�.");
				else if(month >=6 && month <=8)
					System.out.println("�����Դϴ�.");
				if(month >=9 && month <=11)
					System.out.println("�����Դϴ�.");
				if(month ==12||month ==1||month==2)
					System.out.println("�ܿ��Դϴ�.");
				System.out.print("�ٽ� �ϰڽ��ϱ�? 1...yes/0...No:");
				retry =  stdln.nextInt();
				
		}while (retry ==1);	

	}

}
