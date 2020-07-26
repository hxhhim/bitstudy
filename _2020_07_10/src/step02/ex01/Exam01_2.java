package step02.ex01;

/*
 * Object 클래스 - toString(),hashCode(),equals(),getClass()
 * =>toString(): 인스턴스의 정보리턴
 * -기본: 클래스@인스턴스식별번호(hashcode)
 * -인스턴스의 간략정보를 리턴할때 사용한다.
 * -기본으로 출력하는 내용은 사용하는데 무의미 할 수 있다.
 * -맘에 안들면 그럼 재정의해서 사용한다.
 * =>hashCode():인스턴스의 식별 코드 리턴
 * -인스턴스를 맵에 저장할 때 태그로 사용한다.
 * -인스턴스끼리 값을 비교할 때 사용한다.
 * => equals(): 두 인스턴스의 비교 결과 리턴
 * -기본: 같은 인스턴스이면 true, 아니면 false
 * => getClass(): 인스턴스가 어떤 클래스인지 그 정보를 리턴한다.
 * 
 * =>finalize(): 가비지 컬렉터가 인스턴스를 메모리에서 해제하기 전에 호출하는 메서드.
 *               이 메서드에서는 보통 인스턴스가 사용했던 자원을 해제시키는 작업을 한다.
 *               그러나 가비지 컬렉터가 언제 호출될 지 알 수 없고, 
 *               프로그램이 종료될때까지 메모리가 부족하지 않다면 가비지 컬렉터가 실행되지 않기 
 *               때문에, 프로그램의 종료될때까지 finalize()는 호출되지 않을 수도 있다.
 *               따라서 실무에서 인스턴스가 사용한 자원을 해제시키기 위한 방법으로는 
 *               finalize()메서드 재정의를 사용하지 않는것이 좋다.
 *               
 * .
 */
public class Exam01_2 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		A r1 = new A();
		A r2 = new A();
		System.out.printf("r1.toString(): %s\n", r1.toString()); 
		System.out.printf("r1.hashCode(): %s\n", Integer.toHexString(r1.hashCode()));
		System.out.printf("r2.toString(): %s\n",r2.toString());
		System.out.printf("r2.hashCode(): %s\n", Integer.toHexString(r2.hashCode()));
		
		if(r1 == r2) {
			System.out.println("r1 ==r2");
		}
		if(r1.equals(r2)) {
			System.out.println("r1.equals(r2)");
		}
		Class c1 = r1.getClass();
		Class c2 = r2.getClass();
		if(c1 == c2) {
			System.out.println("c1 ==c2");
		}
	/*	Object p = r1.getClass();
		A pp = (A)p;
		pp.var1 = 300;
		System.out.println(pp.var1);
	*/	
		System.out.println(c1.getName());
		
		//설계도만 있다면 인스턴스를 생성할수 있다.
		A r3 = (A)c1.newInstance();
		
	}

}
