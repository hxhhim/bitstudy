package test;
import java.util.Scanner;

//학생이름, 국어, 영어, 수학 성적 5명의 값을 입력받아 석차를 출력하는 프로그램을 작성하시오.
//학생 클래스를 만들어서 이름, 국어, 영어 , 수학 점수를 입력받고 평균점수를 구한다.
//평균 점수로 석차를 계산해서 

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student[] st = new student[5];
		float [] score = new float[5];
		System.out.println("5명의 학생정보를 입력해주세요.");
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"번째 학생 정보를 입력하세요:");
			System.out.println((i+1)+"번째 학생의 이름을 입력하세요.");
			String name = sc.nextLine();
			System.out.println((i+1)+"번째 학생의 국어성적을 입력하세요.");
			int kor = Integer.parseInt(sc.nextLine());
			System.out.println((i+1)+"번째 학생의 영어성적을 입력하세요.");
			int eng = Integer.parseInt(sc.nextLine());
			System.out.println((i+1)+"번째 학생의 수학성적을 입력하세요.");
			int math = Integer.parseInt(sc.nextLine());
			student st1 = new student(name,kor,eng,math);
			st[i]=st1;
		}
		
		for(int i=0;i<5;i++) {
			score[i] = st[i].avr;
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				if(score[j]>score[j+1]) {
					float temp;
					temp = score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
				}
			}
		}int j=5;
		for(int i=0;i<5;i++) {
			for(int k=0;k<5;k++) {
			if((st[k].avr)==(score[i])) {
				st[k].rank=j;
				j--;
				break;
			}
				
			}
		}
		for(student s: st) {
			System.out.println(s);
		}
//		for(float s: score) {
//			System.out.println(s);
//		}
		
		

	}

}
