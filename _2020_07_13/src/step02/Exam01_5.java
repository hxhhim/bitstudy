package step02;
/*
 * 주제: String 클래스 - Mutable 과 Immutable 객체
 * =>Mutable 객체 : 값을 바꿀수 있는 개체
 * 	=> StringBuffer, StringBuilder
 * =>Immutable 객체: 값을 바꿀수 없는 개체
 * 	=>String
 */
public class Exam01_5 {

	public static void main(String[] args) {
		//1)Immutable 객체
		//String 클래스는 한번 값을 저장하면 절대 변경할수 없는 Immutable 객체이다.
		String s1 = new String("abcdefghijk");
		
		//특정위치의 문자열을 다른 문자열로 대체하기
		String s2 = s1.replace("def", "xoxo");
		System.out.println(s1);//원래의  s1객체
		System.out.println(s2);//새로만든 스트링 객체
		

		//2)Mutable 객체
		//StringBuffer는 값을 변경 할수 있는 mutable 객체이다.
		StringBuffer sb1 = new StringBuffer("abcdefghijk");
		
		StringBuffer sb2 = sb1.replace(3, 6, "xoxo");//리턴값은 자기 자신의 주소이다.
		if(sb1 == sb2) {
			System.out.println("sb1==sb2");
		}
		System.out.println(sb1);
		
		
	}

}
