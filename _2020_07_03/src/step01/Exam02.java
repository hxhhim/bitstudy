package step01;

/*
 * 새 데이터 타입 정의하기(class)
 * 1) 새 데이터 타입 정의
 * 
 */
public class Exam02 {
//1) 새 데이터 타입 정의
	static class Student{
		int no;
		float kor;
		float eng;
		float math;
		//사용자 정의 연산자 추가 : "메서도"라 부른다.
		//=> 가산점 추가하는 메서드
		void addBounus (int score) {
			kor += score;
			eng += score;
			math += score;
		}
		//=>총점을 계산해주는 메서드
		float sum() {
			return kor + eng + math;
		}
		//=> 평균을 계산해주는 메서드
		float aver() {
			return sum()/3;
		}
		
		
	}
	public static void main(String[] args) {
		int a;
		//2) Student 메모리의 주소를 저장할 변수 선언
		//=> "레퍼런스(reference)"라 부른다.
		Student s1;
		//3) Student 타입의 메모리를 준비한다.
		//=> "인스턴스(instance)"라 부른다.
		s1 = new Student();
		
		//4)메모리에 값을 저장한다.
		s1.no =1;
		s1.kor =95f;
		s1.eng = 100f;
		s1.math = 97.5f;
		s1.addBounus(5);
		//5)총점과 평균을 출력한다.
		float sum = s1.sum();
		float aver = s1.aver();
		System.out.printf("총점:%f\n", sum);
		System.out.printf("평균:%f\n", aver);
		
	}
}
