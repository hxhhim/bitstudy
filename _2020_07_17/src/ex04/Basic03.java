package ex04;

import java.util.Scanner;

/*
  Student클래스를 정의하고 사용합니다
   이 클래스의 필드는 이름과 나이, 국어, 수학, 영어
   점수를 갖습니다
   메서드는 필드를 초기화하기 위한 생성자
            기본정보 출력(이름과 나이)
			전체정보 출력(전체 필드)
			총점 출력
			평균 출력
    이렇게 구성합니다.

 */
public class Basic03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생정보 입력
				
		System.out.println("학생이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("나이을 입력해주세요.");
		String age = sc.nextLine();
		System.out.println("국어점수을 입력해주세요.");
		int korscore = Integer.parseInt(sc.nextLine());
		System.out.println("수학점수을 입력해주세요.");
		int mathscore = Integer.parseInt(sc.nextLine());
		System.out.println("영어점수을 입력해주세요.");
		int engscore = Integer.parseInt(sc.nextLine());
		Student student = new Student(name,age,korscore,mathscore,engscore);
		
		
		student.sum();
		student.avg();
		
		student.basicprint();
		System.out.println("----------------");
		student.advanceprint();
		
		
		System.out.println("총점: "+student.sum+"입니다.");
		System.out.printf("평균: %.2f 입니다.",student.avg);
		
		//
		//기본출력(이름,나이)
		//전체정보출력(전체필드)총점,평균
		
		
	}

}
