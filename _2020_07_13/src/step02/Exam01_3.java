package step02;

/*
 * 주제: String 클래스 - Literal String 인스턴스와 일반 String 인스턴스
 */
public class Exam01_3 {

	public static void main(String[] args) {
		//일반 String 인스턴스생성: Heap 영역에 인스턴스가 존재
		//=>가비지 컬렉션의 대상: 가비지가 되면 가비지 컬렉터가 메모리 해재해 준다.
		//=>일반 인스턴스이다.
		String s1 = new String("hello");
		
		//Literal String 인스턴스 생성: constant string pool에 존재
		//=>JVM이 종료할때까지 유지된다.
		//=> 중복을 허용하지 않는 인스턴스. 중복 생성되지 않는다.
		//=>메모리를 좀 더 효율적으로 사용하기 위해 
		String s2 = "hello";//=> new String("hello")와 같다.
		
		if(s1 == s2) {//서로다른 String 인스턴스임을 증명
			System.out.println("s1==s2");
		}
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2)");
			
		}
		String x1 = new String("hello");
		String x2 = "hello";//이미 constant string pool에 "hello"
		//스트링 인스턴스가 존재하기 때문에, 새로 생성되지 않고 인스턴스의 주소가 리턴된다.
		if(s1 == x2) {//Heap의 생성된 인스턴스는 다르다.
			System.out.println("s1==x1");
			
		}if(s2 == x2) {//constant string pool에 생성된 인스턴스는 같다.
			System.out.println("s2==x2");
		}
		String x3 = "hello";
		if(x2 == x3) {
			System.out.println("x2==x3");
		}

	}

}

/*
 * String s ="리터럴";
 * =>리터럴(literal)로 생성한 스트링 인스턴스는
 * 		상수 스트링 풀(constant string pool)에서 관리한다.
 * =>메모리를 효율적으로 관리하기 위해
 * 	 값이 같은 인스턴스를 중복 생성하지 않는다.
 * 
 * 리터럴(literal)?
 * =>직접 코드로 값을 표현한것.
 * int i = 10;//리러럴?10
 * boolean b = true; //리터럴=> true
 * 
 */













