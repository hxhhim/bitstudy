package step01;

/*
 * �� ������ Ÿ�� �����ϱ�(class)
 * 1) �� ������ Ÿ�� ����
 * 
 */
public class Exam02 {
//1) �� ������ Ÿ�� ����
	static class Student{
		int no;
		float kor;
		float eng;
		float math;
		//����� ���� ������ �߰� : "�޼���"�� �θ���.
		//=> ������ �߰��ϴ� �޼���
		void addBounus (int score) {
			kor += score;
			eng += score;
			math += score;
		}
		//=>������ ������ִ� �޼���
		float sum() {
			return kor + eng + math;
		}
		//=> ����� ������ִ� �޼���
		float aver() {
			return sum()/3;
		}
		
		
	}
	public static void main(String[] args) {
		int a;
		//2) Student �޸��� �ּҸ� ������ ���� ����
		//=> "���۷���(reference)"�� �θ���.
		Student s1;
		//3) Student Ÿ���� �޸𸮸� �غ��Ѵ�.
		//=> "�ν��Ͻ�(instance)"�� �θ���.
		s1 = new Student();
		
		//4)�޸𸮿� ���� �����Ѵ�.
		s1.no =1;
		s1.kor =95f;
		s1.eng = 100f;
		s1.math = 97.5f;
		s1.addBounus(5);
		//5)������ ����� ����Ѵ�.
		float sum = s1.sum();
		float aver = s1.aver();
		System.out.printf("����:%f\n", sum);
		System.out.printf("���:%f\n", aver);
		
	}
}
