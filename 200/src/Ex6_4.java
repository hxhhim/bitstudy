
public class Ex6_4 {

	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76);
		
		
		System.out.println(s.info());
		
	}

}
class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student (String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		return (int)(getTotal()/3f*10+0.5f)/10f;//10을곱하고 0.5를 더한뒤 10으로 나누며녀 반올림
	}
	public String info() {
		return name
		+","+ban
		+","+no
		+","+kor
		+","+eng
		+","+math
		+","+getTotal()
		+","+getAverage()
		;
		
		
	}
}
