package ex;

import java.util.Arrays;
import java.util.Scanner;

public class ex6_5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("사람수:");
		int m = sc.nextInt();
		int[] arr = new int[m];
		int sum =0;
		int avg =0;
		for(int i = 0,cnt =1; i<m;i++) {
			System.out.println(cnt+"번의 점수:");
			arr[i] =sc.nextInt();
			sum +=arr[i];
			cnt++;
		}
		avg = sum/m;
		Arrays.sort(arr);
		System.out.println("합계는"+sum+"점입니다.");
		System.out.println("평균는"+avg+"점입니다.");
		System.out.println("최고점은 "+arr[m-1]+"점 입니다");
		System.out.println("최저점은 "+arr[0]+"점 입니다.");
		
		
	}

}
