package step01.exam02;

public class Score {
	String name;
	int kor;
	int math;
	int eng;
	
	//sum�� aver�� �ܺο��� ������� �������� ���ϰ� ���´�.
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
