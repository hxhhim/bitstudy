package edu.exam00.transtype05;
//�ڵ� �� ��ȯ
//1) ����� ���� ���� -> ����ũ ū�Ϳ� ��������.
//2) ����(ǥ������ ���� ��)-> �Ǽ�(ǥ������ ū��)

public class AutoTransType {
	public static void main(String[] args) {
		//ch�� ���� i�� ��ȯ�Ǿ� ���Եȴ�.
		char ch = 'A';
		int i = ch;
		System.out.println(i);
		
		//b�� int�� �ڵ� ��ȯ�Ǿ� ����ȴ�.
		byte b = 100;
		int n = 100;
		System.out.println(b*n);
		
		//r�� double�� ��ȯ�Ǿ� ����ȴ�.
		int r = 3;
		double pi = 3.14D;
		System.out.println(r*r*pi);
		
		byte x = 100;
		byte y = 100;
		System.out.println(x*y);
		System.out.println((byte)(x*y)); //���� �÷ο� �߻�
		
	}
}
