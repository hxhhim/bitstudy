package ex04;

import java.util.Arrays;

/*
  1. String str = "ABCDEFGHIJKLMN" �� StringBuilder�� ����Ͽ� 
  	�������� ����ϼ���
 */
public class Middle01 {

	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMN";
		//char[]�� �������� �������� StringBuilder�� ���ڿ��� �߰��� ���
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		System.out.print(sb.reverse());
		
	}

}
