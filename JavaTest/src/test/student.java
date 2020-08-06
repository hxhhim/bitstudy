package test;

public class student {
	String name;
	int kor;
	int eng;
	int math;
	float avr;
	int rank;
	
	public student(String name, int kor,int eng,int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avr= (float)(kor+eng+math)/3;
		this.avr= (float) (Math.round(this.avr*100)/100.0);
	}
	public String toString() {
		return "학생이름 :"+name+"국어성적: "+kor+"영어성적: "+eng+"수학성적: "+
				math+"평균점수: "+avr+"석차: "+rank;
	}
}
