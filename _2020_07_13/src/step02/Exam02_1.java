package step02;
/*
 * 주제: StringBuffer 클래스
 * 버퍼(buffer)?
 * => 데이터를 보관하는 메모리 영역, 보토오 배열로 만든다.
 * 캐쉬(cache)?
 * => 데이터를 백업하는 메모리 영역, 보통 하드 디스크의 임시 폴더
 */
public class Exam02_1 {

	public static void main(String[] args) {
		StringBuffer buf1 = new StringBuffer("hello");
		
		//StringBuffer는 mutable 객체이다
		//=> 데이터를 변경할 수 있다.
		//=> 계속 문자열을 변경해야 하는 에디터를 만들때 사용할 수 있다.
		buf1.append(",world");
		System.out.println(buf1);

	}

}
/*
 * String vs StringBuffer vs StringBuilder?
 * 1)Immutable vs Mutable
 * =>String은 Immutable 객체로서 데이터를 변경할 수 없다.
 * =>StringBuffer와 StringBuilder는 Mutable 객체로서 데이터를 변경 할수 있다.
 * 2)Tread-safe 여부
 * => StringBuffer는 thread-safe하다. 즉 여러 스레드가 동시에 접근하더라도,
 * 한 번에 한 스레드만이 데이터를 변경하도록 관리해 준다.
 * =>StringBuilder는 thread-safe 하지 않다. 즉 여러 스레드가 동시 접근하여
 * 값을 바꿀수 있다. 데이터가 일치하지 않는 문제가 발생한다. 
 */
