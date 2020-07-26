package Ex01;

import java.util.Calendar;

public class exam01_1 {

	public static void main(String[] args) {
		
		//Calenda cal = new Calendar(); //protected 로 접근을 제한한다.
		//서브 클래스나 같은패키지 소속 클래스가 아니면, 접근(호출,실행)을 제한한다.
		
		Calendar cal = Calendar.getInstance();
		//Calendar는 왜 생성자 호출을 제한 했는가?
		//=>생성자를 호출할 수 없으면 "달력"객체를 만들수 없다.
		//=>이유?
		//  -달력객체를 생성하는 코드가 복잡하기 때문에 
		//	-즉 개발자가 직접 달력을 생성하려면 System.currentTimeMillis()를 통해
		//	 현재 시간정보를 얻어야 하고, 그 얻은 시간을 가지고 달력객체를 생성해야 하는데,
		//	 그런 번거로움을 없애기 위해 별도로 스태틱 메서드를 제공해 준다.
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		if(cal2==cal3) {
			System.out.println("cal2==cal3");
		}
		System.out.println(cal);
		System.out.println(cal2);
		System.out.println(cal3);
	}

}
