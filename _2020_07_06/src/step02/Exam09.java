package step02;


public class Exam09 {
	public static void main(String[] args) {
		java.util.Scanner keyScanner = new java.util.Scanner(System.in);
		System.out.print("�̸�? ");
		String name = keyScanner.nextLine();
		
		System.out.print("����? ");
		int age = java.lang.Integer.parseInt(keyScanner.nextLine());
		System.out.printf("%s(%d)\n", name,age);
	}
}
/*
*#��Ű�� Ŭ���� ����
*- �ٸ� ��Ű���� �Ҽӵ� Ŭ������ ����Ҷ���
*	�ݵ�� ��Ű������ �����ؾ� �Ѵ�.
*- ����!
*	java.lang��Ű���� Ŭ������ ����Ҷ��� �������� �ʾƵ� �ȴ�.
*	�ڹ� �����Ϸ��� �ڵ����� ã�´�. 
*- ����!
*	java.lang ��Ű���� �����Ѵٰ��ؼ� �� ���� ��Ű������ ���Ǵ°��� �ƴϴ�.
*	java.lang.relect, java.lang.annoation �� �� ���� ��Ű���� Ŭ������ ����Ҷ���
*	������ ��Ű�� �̸��� ����� �Ѵ�.
*	
*/

/*
 * #import ����
 * 1)Ŭ������ ��Ű�� ������ ��Ȯ�ϰ� ����
 * => import java.util.Scanner;
 * 2)Ŭ������ �Ҽӵ� ��Ű�� ������ ����
 * => import java.util.*;
 * => ����: java.util�� ��� Ŭ������ �����Ӱ� ����� �� �ִ�.
 * => ����: ���������Ҷ� �ڵ忡�� ����� Ŭ������ ��Ȯ�ϰ� � ��Ű���� �ִ��� 
 * 		     �˱��ƴ�.=>�ǹ������� ������ 1)�� ����� ����Ѵ�.
 *  
 *  ���� ���� �ϴ� ����!
 *  =>import ������ ������ .class ������ ũ�Ⱑ Ŀ���ٰ� �����Ѵ�.
 *  =>import�� �������Ҷ� �����Ϸ����� �����ϴ� �����̱� ������ ������ �� �Ŀ��� 
 *    import ���� �����Ѵ�.
 *  =>������ �߿��� import ���� �� ���� ���̱� ���� wildcard(*)�� ����ϴ� ��찡 �ִ�.=>
 *    .class ������ ũ���ϰ� �������.
 */
