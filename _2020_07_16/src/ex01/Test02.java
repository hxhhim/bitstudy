package ex01;

public class Test02 {

	public static void main(String[] args) {
	
	//  ������ ���� ��Ģ�� ���� �������̽� ���۷��� ������ 
	//	�� �������̽��� ������ Ŭ������ ��ü(�� �ּ�)�� ������ �� �ִ�.
	//	Calc c = new Calc(); //�������̽��� ��Ģ�̱� ������ �ν��Ͻ��� ����� ����.
		Calc c2 = new Calcimpl();
		
		//"�������̽��� ����ü"
		//=> Calcimpl Ŭ����ó�� �������̽� ��Ģ�� ���� ���� Ŭ������ �θ��� ��.
		System.out.println(c2.plus(10, 30));
	}

}
