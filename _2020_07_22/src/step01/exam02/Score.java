package step01.exam02;

public class Score {
	String name;
	int kor;
	int math;
	int eng;
	
	//sum과 aver는 외부에서 마음대로 접근하지 못하게 막는다.
	//private defaoult proteced public
	private int sum;
	private float aver;
	
	void compute() {
		sum = kor + math + eng;
		aver = sum/3f;
	}
	int getSum() {
		return sum;
	}
	float getAver() {
		return aver;
	}
}
