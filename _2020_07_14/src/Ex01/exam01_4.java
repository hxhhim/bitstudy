package Ex01;

import java.text.DateFormat;
import java.util.Calendar;

public class exam01_4 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
	
		//1) �⺻ ��� ����=> ���� os�� ������ ����, ���, ��¥ ������ ������.
		DateFormat df = DateFormat.getDateInstance();
		String str = df.format(cal.getTime());
		System.out.println(str);
		
		//2) �ٸ� ��� ����
		df = DateFormat.getDateInstance(DateFormat.FULL);
		str = df.format(cal.getTime());
		System.out.println(str);
		
	}

}
