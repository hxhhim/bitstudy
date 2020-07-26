package step02;

import java.util.Date;

/*
 * 주제: Date 클래스  - java.util.Date 소개
 * 
 */
public class Exam03_1 {

	public static void main(String[] args) {
		//1)현재 시간및 날짜 정보를 가져오기
		//1970년 1월 1일 0시 0분 0초부터 현재 까지의 시간을
		//1/1000ch(micro seconds)단위의 값으로 리턴한다.
		long currTime = System.currentTimeMillis();
		System.out.println("currTime:"+currTime);
		
		//2)밀리초를 년,월,일,시,분,초 정보로  분석
		Date today = new Date(currTime);
		
		System.out.printf("%d-%d-%d%d:%d:%d\n",
				+ today.getYear()+1900, today.getMonth()+1,
				  today.getDate(), today.getHours(),
				  today.getMinutes(),today.getSeconds());
		
		//3)생성자에 시간을 지정하지 않으면 현재 시간이 자동계산된다.
		today = new Date();
		System.out.printf("%d-%d-%d%d:%d:%d\n",
				+ today.getYear()+1900, today.getMonth()+1,
				  today.getDate(), today.getHours(),
				  today.getMinutes(),today.getSeconds());
		
	}

}
