package Ex01;

import java.util.Calendar;

public class exam01_2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//항목 번호 : 년(1),월(2)+1하는이유 0부터여서,일(5),시(12시간:10,24시간:11),분(12),초(13)
		System.out.printf("%d-%d-%d %d:%d:%d\n",
				cal.get(1),
				cal.get(2)+1,
				cal.get(5),
				cal.get(11),
				cal.get(12),
				cal.get(13));
		//상수 사용후: 코드가 읽기 편하다. 이해가 빠르다.
		System.out.printf("%d-%d-%d %d:%d:%d\n",
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,
				cal.get(Calendar.DAY_OF_MONTH),
				cal.get(Calendar.HOUR_OF_DAY),
				cal.get(Calendar.MINUTE),
				cal.get(Calendar.SECOND));
				

	}

}
