package ex_07_01;

import java.util.Scanner;

public class Ex4_18_1 {

//입력한 정수의 모든 약수와 개수 표시
//약수는 나누어 떨어지는 수
	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("정수값:");
		int n = stdln.nextInt();
		int cnt = 0;
		for(int i =1; i<=n; i++)
			if(n%i==0) {
				System.out.print(i+" ");
				cnt++;
				}
		System.out.println(n+"의 약수는"+ cnt +"개입니다.");

	}

}
