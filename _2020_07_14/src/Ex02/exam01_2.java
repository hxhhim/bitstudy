package Ex02;

public class exam01_2 {

	public static void main(String[] args) {
		int i = 10;
		Integer obj3 = new Integer(i);
		
		String str = obj3.toString(); //���ڸ� ���ڿ��� ����� ����
		System.out.println(str);
		
		int value  = obj3.intValue(); //�ν��Ͻ��� ����ִ� int ���� ����
		System.out.println(value);
		
		float f = obj3.floatValue();  //�ٸ� Ÿ���� ������ ��ȯ�Ͽ� ����
		System.out.println(f);
				
		String str2  = Integer.toHexString(375); //�Է¹��� int ���� 16������ ǥ���� ���ڿ��� ����
		System.out.println(str2);

		int value2  = Integer.parseInt("123");// �Է¹��� ���ڿ��� int ������ �ٲ� ����
		System.out.println(value2);
	}

}
