package step02;

import java.util.Arrays;

public class Exam01_8 {

	public static void main(String[] args) {
		String[] arr = "홍길동/임꺽정/유관순/임청하/왕조현/오천련".split("/");
		System.out.println(Arrays.toString(arr));
		
		for(String s : arr)
			System.out.println(s);
	}

}
