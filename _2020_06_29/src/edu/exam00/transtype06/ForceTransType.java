package edu.exam00.transtype06;

// ���� ����ȯ
// �ڵ����� ����ȯ�� �̷������ ������
// �츮�� �ǵ��Ͽ� ������ ��ȯ��Ű�� ��
// ����� ū �� or ������ ū����
// ==> ���� ������ ��ȯ�Ϸ��� �Ҷ�

public class ForceTransType {
	public static void main(String[] args) {
		//1byte�� ������ 3byte�� �����
		//byte������ �Ѵ� ���ڴ� ���� �ְ��
		int num = 0b00000_0000_0000_0000_0000_0001_0000_0011;
		byte b = (byte)num;
		System.out.println(num);
		System.out.println(b);
		
		//char(2byte) 0x0000~0xFFFF ĳ���ʹ� ������ ����.
		//short(2byte) -7FFF~ 7FFF
		char ch = '��';
		int i;
		i = ch;
		short s = (short)ch;
		System.out.printf("ch:  0x%02X s: 0x%02X\n",i, s);
		System.out.println(s);
		
		
		//���� 4byte�� ������ float�� ǥ�������� �б� ������
		//�Ҽ����� ��������.
		float f = 13.3f;
		int ii = (int)f;
		System.out.println(ii);
		
		//long 8byte �̰� float�� 4byte����
		//float�� ǥ�������� ũ�⶧����
		//lval�� float�� �ڵ� ��ȯ�ȴ�.
		long lval = 1234L;
		float fNum = lval;
		System.out.println(fNum);
		
	}
}
