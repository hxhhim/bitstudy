package Ex_after;

public class Exam02 {
	static class Student{
		int no;
		float kor;
		float eng;
		float math;
		void addBonus (int score) {
			kor +=score;
			eng +=score;
			math +=score;
		}
		float sum() {
			return kor+eng+math;
		}
		float aver() {
			return sum()/3;			
		}
	
	}
	public static void mains(String[] args) {
		int a;
		Student s1;
		s1 = new Student();
		
		s1.no =1;
		s1.kor =95f;
		s1.eng = 100f;
		s1.math = 97.5f;
		s1.addBonus(5);
		float sum = s1.sum();
		float aver = s1.aver();
		System.out.printf("ÃÑÁ¡:%f\n", sum);
		System.out.printf("Æò±Õ:%f\n", aver);
		
		
		
	}
}
