package step01.exam01;

public class Test02 {

	public static void main(String[] args) {
		//�л��� ���������͸� ǥ���ϴ� Ŭ���� "Score"
		//=>�л�������  Score��� Ŭ���� �������� �߻�ȭ(������ȭ)���״�.
		
		Score s = new Score();
		s.name = "ȫ�浿";
		s.kor = 100;
		s.math = 90;
		s.eng = 100;
		
		s.sum = s.kor + s.math + s.eng;
		s.aver = s.sum/3f;
		System.out.printf("�հ�: %d, ��� %.2f\n", s.sum,s.aver);
		
		//������ �޼��� �߿����� sum�̳� aver�� ���� ���Ƿ� �����ؼ� 
		//���� �����ؼ��� �ȵǴ� ��찡 �ִ�.
		//������ ���� ���� ������� �ٲ� �� �ִٸ� �������� �ŷڼ��� �������� �ȴ�.
		//�ذ�å?
		s.sum = 20;
		s.aver = 100f;
		System.out.printf("�հ�: %d, ��� %.2f\n", s.sum,s.aver);
	}

}