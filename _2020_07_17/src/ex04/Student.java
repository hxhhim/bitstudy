package ex04;

public class Student {
	String name;	//이름
	String age;		//나이
	int korscore;	//국어점수
	int mathscore;	//수학점수
	int engscore;	//영어점수
	int sum;
	double avg;
	
	public Student(String name, String age, int korscore,int mathscore,int engscore){
		this.name = name;
		this.age = age;
		this.korscore = korscore;
		this.mathscore = mathscore;
		this.engscore = engscore;
	}
	public void sum() {
		 sum = korscore+mathscore+engscore;
	}
	
	public void avg() {
		avg = (double)sum/3;
	}
	public void basicprint() {
		System.out.println("기본정보출력");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}public void advanceprint() {
		System.out.println("전체정보출력");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("국어점수: "+korscore);
		System.out.println("수학점수: "+mathscore);
		System.out.println("영어점수: "+engscore);
	}
	
	
	}
	

