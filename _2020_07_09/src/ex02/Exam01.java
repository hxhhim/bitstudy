package ex02;

public class Exam01 {

	public static void main(String[] args) {
		Calculator  calc = null;
		//�ν��Ͻ��� ������� �ʴ� �޼��带 ȣ���ϴ��� 
		//�� �޼��尡 �ν��Ͻ� �޼����� ���
		//������ ��ȿ�� �ν��Ͻ� �ּҸ� �Ѱܾ� �Ѵ�.
		//�ν��Ͻ� �ּҰ� null�̴�. ���� �������!!! 
	//	calc.plus(3);
		calc = new Calculator();
		calc.plus(10);
		calc.plus(7);
		calc.minus(5);
		System.out.println(calc.result);
	}

}
