package Ex03;

import java.util.HashSet;

/*
 * HashSet
 * => 값을 저장하는 규칙
 * -집합을 본따 만든 객체이다. 즉 같은값을 중복 저장하지 않는다.
 * -중복 여부 비교 방법?
 * =>hashCode의 리턴값이 같고
 * equals()의 리턴값이 true라면 같은 값으로 취급한다.
 * -null값을 저장 할수 있다.
 * -꺼낼때 저장된 순서대로 꺼낼수 없다. 
 */
public class Exam01_6 {

	public static void main(String[] args) {
		HashSet<String> names= new HashSet<>();
		
		names.add("홍길동");
		names.add("홍길동");
		names.add(null);	//null 값 저장 가능
		names.add("임꺽정");
		names.add(null);	//중복저장 안된다.
		names.add("임꺽정");	//중복저장 안된다.
		names.add("유관순");
		names.add(new String("홍길동")); //인스턴스가 다른데도 불구하고 중복으로 간주된다.
		//이유는?hashCode()의 리턴값이 같고, equals()리턴결과가 true이기 때문이다.
		
		for(String s : names) {
			System.out.println(s);
		}
		Object[] arr = names.toArray();
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println("--------------------");
		System.out.printf("홍길동:%d\n","홍길동".hashCode());
		System.out.printf("홍길동:%d\n", new String("홍길동").hashCode());
		System.out.printf("임꺽정:%d\n","임꺽정".hashCode());
		System.out.printf("홍길동.equals(other): %b\n","홍길동".equals(new String("홍길동")));
		
	}
	
	
}
/*
 * HashSet의 값 저장원리?
 * =>인덱스를 사용하여 않고, 인스턴스의 해시코드를 사용하여 그저장 위치를 결정한다.
 * =>그래서 저장순서는 인스턴스의 해시값이 결장한다.
 * 
 * 해시값(hash code)?
 * =>객체또는 값을 식별하기 위해 부여된 고유번호
 * =>특별한 계산공식(알고리즘)에 따라 각 인스턴스에 대해 값을 부여한다.
 *
 */
