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
		return "�л��̸� :"+name+"�����: "+kor+"�����: "+eng+"���м���: "+
				math+"�������: "+avr+"����: "+rank;
	}
}
