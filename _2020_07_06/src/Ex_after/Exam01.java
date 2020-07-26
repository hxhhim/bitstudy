package Ex_after;

public class Exam01 {

	static class Student{
		int no;
		float kor;
		float eng;
		float math;
		
	}
	public static void main(String[] args) {
		int a;
		Student s1;
		s1 = new Student();
		
		s1.no =1;
		s1.kor = 95f;
		s1.eng = 100f;
		s1.math = 97.5f;
		
		float sum = s1.kor+s1.eng+s1.math;
		float aver = sum/3;
		System.out.printf("ÃÑÁ¡:%f\n", sum);
		System.out.printf("Æò±Õ:%f\n", aver);
		
	}
}
