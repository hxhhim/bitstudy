package Ex03;

import java.util.ArrayList;

public class Exam01_5 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("홍길동");
		names.add("홍길동");	//위와 같은 객체(의주소)저장
		names.add(null);    //null 값 저장 가능
		names.add("홍길동");

			
		for(int i =0;i<names.size();i++)
			System.out.println(names.get(i));
			
		for(String s :names) {
			System.out.println(s);
			
		}
;	}

}
