package edu.exam00.dataType03;

/*
 * DataType(�ڷ���)
 * ������ �����Ҷ� � ������ �����ΰ���
 * �ڹ� �����Ϸ����� �˷��ִ� ���
 * boolean 1byte  true, false  ��
 * char	   2byte  �����ڵ�             ����
 * byte	   1byte  -128~127         �� ��
 * short   2byte  -32768~ 32767  ����
 * int     4byte   -21��~21��      ����
 * long    8byte  -900��~900��    ����
 * float   4byte  �Ҽ��� 6�ڸ� ��ȿ  �Ǽ�
 * double  8byte  �Ҽ��� 15�ڸ� ��ȿ  �Ǽ�
 * string  						���ڿ�
 * 
 * ������ �ܿ� �ʿ���� bit�� byte�� ���踦 �˸�
 * ��� ����(�뷫�˸� �ȴ�)
 * 
 * ���ֻ���ϴ� �ڷ���
 * boolean, char, int, double, string
 * 
 */
public class DataType {
	public static void main(String[] args) {
		boolean isVal = true; //false;
		char ch = '��';
		char ch1 = 'A';
		byte bNum = 100;
		short sNum = 10000;
		int iNum = 1000_000_000;
		long lNum = 1000_000_000_000L;
		float fNum = 3.14f;
		double dNum = 3.14d;
		
		System.out.println(isVal);
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		
		

}
}