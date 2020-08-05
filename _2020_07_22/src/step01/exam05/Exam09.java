package step01.exam05;

import java.util.Scanner;

/*
 * finally
 * => try �Ǵ� catch ������ ������ ���� �ݵ�� ����ȴ�.
 * =>�׷��� finally ���Ͽ��� ���������� ����ǵ� ���ܰ� �߻��ϵ� ������� 
 * 	�ݵ�� �����ؾ� �ϴ� �ڵ带 �д�.
 * =>���� ������ �ݰų� �����ͺ��̽��� �ݴ� ���� �ڿ��� �����ϴ� �ڵ带 �д�.
 * 
 */
public class Exam09 {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		try {
			System.out.println("try.....���Ͻ���");
			System.out.println("��? ");
			int value = keyScan.nextInt();
			if(value ==1 ) {
				throw new Exception ("���ܹ߻�!");
			}
			return;//�޼��� �ø����� ��� �����Ѵ�.
		}catch(Exception e) {
			System.out.println("catch....���Ͻ���");
			return;
		}finally {
			System.out.println("finally....���Ͻ���");
			keyScan.close();
		}
		
	}

}