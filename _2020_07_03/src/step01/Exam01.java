package step01;

/*
 * �� ������ Ÿ�� �����ϱ�(class)
 * 1) �� ������ Ÿ�� ����
 * 
 */
public class Exam01 {
//1) �� ������ Ÿ�� ����
	static class Student{
		int no;
		float kor;
		float eng;
		float math;
		
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
		
		//5)������ ����� ����Ѵ�.
		float sum = s1.kor + s1.eng + s1.math;
		float aver = sum/3;
		System.out.printf("����:%f\n", sum);
		System.out.printf("���:%f\n", aver);
		
	}
}
