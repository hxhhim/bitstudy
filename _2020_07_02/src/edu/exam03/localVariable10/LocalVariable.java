package edu.exam03.localVariable10;

import java.util.Random;

/*
 *  �޼ҵ� �߰�ȣ{} �������� ������ �����ϸ�
 *  �̰��� "��������"��� �θ���.
 *  1)���������� Ư¡�� Stack�޸𸮿� �ö󰡸�
 *    �޼��� ȣ���� ��ź�� Stack���� ������� Ư¡�� �ִ�.
 *    �޸� �����ϱ� ���� �ʿ��Ҵ� �����ϰ�
 *    �뵵 ������ ��������ΰ� ����� ����
 *  2) ���������� ��밡���ϴ�.
 *     �� �ٸ� �޼��忡 ������ �̸��� ������ �־ ���� �ٸ� �����̴�.
 *  3) �Ű������� ���������̴�.
 *     ���� ���� ���� �޼��忡�� �ϳ��� ������ �����ϰ� �ʹٸ� 
 *     Ŭ���� ������ �����ؾ߸� �Ѵ�.
 *     Ŭ������ ������ ������ ��� �޼��忡�� ���ٰ����ϴ�.
 *    
 *  ���� Ŭ���� ������ ��� �����ϰ� ���� ������ �̚�� �ʵ� �����ؾ� �Ѵ�.
 *  �ʵ�� Ŭ���� ��� ������ �ǹ��Ѵ�.  
 *    
 */
		
public class LocalVariable {
	
	//Ŭ���� ��� ����, �ʵ�(Field);
	public static Random rd = new Random();
	public static int num = 0; 
	public static void method0() {
//		int num = 0;//��������
		num = rd.nextInt(100);
		System.out.println("method0 : "+num);

	}
	
	public static void method1() {
//		int num = 0;//��������
		num = rd.nextInt(100);
		System.out.println("method1 : "+num);

	}
	public static void main(String[] args) {
//		int num = 0;//��������
		method0();
		System.out.println("num : "+ num);
		method1();
		System.out.println("num : "+ num);

	}

}
