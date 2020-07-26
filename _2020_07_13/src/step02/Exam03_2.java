package step02;

import java.sql.Date;
class A{
	int var = 100;
	public String toString() {			//원하는 식으로 출력하려면 tostring을 재정의해라
        return "A[var: "+var+"]";
    }
}
public class Exam03_2 {

	public static void main(String[] args) {
		Object obj = new Object();
		A test = new A();
		
		System.out.println(test);
		System.out.println(obj);
		
		long currTime = System.currentTimeMillis();
		Date today = new Date(currTime);
		//같은 이름의ㅡ 클래스를 동시에 사용하고 싶다면,
		//한 클래스의 이름은 전체이름(패키지명을 포함한 이르므)으로 지정한다.
		java.util.Date today2 = new java.util.Date(currTime);
		System.out.println(today);
		System.out.println(today2);
	}

}
