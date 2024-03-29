package Ex01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 기존 DateFormat 클래스는 출력 형식이 고정되어 있고, 몇가지 안된다.
 * 그래서 자바는 사용자 입맛에 맞게 출력 형식을 지정할 수 있도록 
 * DateFormat 클래스에 기능을 덧붙인 SimpleDateFormat 클래스를 제공한다.
 */
public class exam01_5 {

	public static void main(String[] args) throws ParseException  {
		Calendar cal = Calendar.getInstance();
		
		//Date-->String
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String str = df.format(cal.getTime());
		System.out.println(str);
		System.out.println(cal.getTime());
		
		//String-->Date
		Date date = df.parse("2020-07-14 10:56:23");
		System.out.println(date);

	}

}
