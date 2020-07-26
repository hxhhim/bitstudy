package ex;

import java.util.Scanner;

public class Ex6_6_1 {

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int n = stdln.nextInt();
		int[] a = new int[n];
		
		for(int j=0;j<n;j++) {
			System.out.print("a["+j+"]=");
			a[j] = stdln.nextInt();
		}
		System.out.print("찾을 숫자:");
		int key = stdln.nextInt();
		
		int i;
		for(i=0; i<n; i++)
			if(a[i] == key)
				break;
		
		if(i<n)
			System.out.println("그 값은 a["+i+"]에 있습니다.");
		else
			System.out.println("해당값이 존재하지 않습니다.");

	}

}
/*
*	for(i=n-1; i>=0; i--)
*		if(a[i] ==key)
*		break;
*	뒤에있는 요소 찾기
*/