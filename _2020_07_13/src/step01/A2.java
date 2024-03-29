package step01;

public class A2 {
	int var1= 100;
	int var2= 200;
	
	
	
	public String toString() {
		return "A2[var1 = " + this.var1 +"]"+"A2[var2 = " + this.var2 +"]";
		
	}
	
	public boolean equals(Object obj) {
		//obj 변수에 A2객체가 넘어올 것이기 때문에 형변환하여 사용하자.
		A2 other = (A2)obj;
		if(this.var1 == other.var1) {
			return true;
		}return false;
	 }
	public int hashCode() {
		/*
		 * 오리지널 hashCode()는 인스턴스 변수 값에 상관없이 무조건 인스턴스 마다 고유의 식별코드를 리턴한다.
		 * =>재정의
		 * 같은 값을 갖는 인스턴스는 같은 해시코드를 리턴하게 만들어 보자.
		 */
		return this.var1;
	}
}
