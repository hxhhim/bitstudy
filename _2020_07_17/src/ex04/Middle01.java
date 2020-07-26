package ex04;

import java.util.Arrays;

/*
  1. String str = "ABCDEFGHIJKLMN" 을 StringBuilder를 사용하여 
  	역순으로 출력하세요
 */
public class Middle01 {

	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMN";
		//char[]로 저장한후 역순으로 StringBuilder로 문자열에 추가후 출력
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		System.out.print(sb.reverse());
		
	}

}
