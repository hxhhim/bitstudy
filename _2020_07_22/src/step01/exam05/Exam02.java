package step01.exam05;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		int a,b;
		
		while(true) {
			System.out.println("a/b?");
			try {
				a = keyScan.nextInt();//�����˻��� �κ��� try�ȿ� �ִ´�.
				b = keyScan.nextInt();
				System.out.printf("����� %d�Դϴ�.\n",a/b);
			}catch(Exception e) {
				System.out.println("������ ������ �߻��߽��ϴ�.\n�ٽ� �õ����ּ���.!");
				keyScan.nextLine();
			}
		}

	}

}
/*
 * ����ó������
 * try{
 * 		���ܰ� �߻��Ҽ� �ִ� �ڵ�
 *	}catch(���������� ���� �� ��ü�� ���� �Ķ���� ����{
 *		���ܸ� ó���ϴ� �ڵ�
 * }catch(������ ������ ���� �� ��ü�� ���� �Ķ���� ����{
 * 		���ܸ� ó���ϴ� �ڵ�
 * }finally{
 * 		���ܰ� �߻��ϵ� ���ϵ� ������ �����ϴ� �ڵ� 
 * }
 * ���� ó�� ������ Ư¡
 * 1)�Ϲ� �ڵ�� ���� ó���ڵ带 ���������ν� �ڵ带 �б� ����.=>�ڵ��� �������� ���δ�.
 * 2)���ܸ� �����ؼ� �ٷ�� �ִ�.
 */
