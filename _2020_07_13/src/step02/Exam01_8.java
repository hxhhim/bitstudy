package step02;

import java.util.Arrays;

public class Exam01_8 {

	public static void main(String[] args) {
		String[] arr = "ȫ�浿/�Ӳ���/������/��û��/������/��õ��".split("/");
		System.out.println(Arrays.toString(arr));
		
		for(String s : arr)
			System.out.println(s);
	}

}
