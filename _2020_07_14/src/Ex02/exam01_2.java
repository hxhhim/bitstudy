package Ex02;

public class exam01_2 {

	public static void main(String[] args) {
		int i = 10;
		Integer obj3 = new Integer(i);
		
		String str = obj3.toString(); //숫자를 문자열로 만들어 리턴
		System.out.println(str);
		
		int value  = obj3.intValue(); //인스턴스에 들어있는 int 값을 리턴
		System.out.println(value);
		
		float f = obj3.floatValue();  //다른 타입의 값으로 변환하여 리턴
		System.out.println(f);
				
		String str2  = Integer.toHexString(375); //입력받은 int 값을 16진수로 표현한 문자열을 리턴
		System.out.println(str2);

		int value2  = Integer.parseInt("123");// 입력받은 문자열을 int 값으로 바꿔 리턴
		System.out.println(value2);
	}

}
