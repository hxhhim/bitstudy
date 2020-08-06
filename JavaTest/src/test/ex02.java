package test;
// 1+1+2+3+5+8+13+ .... 의 순서로 나열되는 피보나치수열의 10번째 항까지의
//   합계를 구하는 프로그램을 작성 하시오.
public class ex02 {

	public static void main(String[] args) {
		int input = 10;
		int sum = 0;
		for(int i=1;i<=input;i++) {
			System.out.print(fibo(i)+"+");
			sum+=fibo(i);
		}
		System.out.println();
		System.out.println("피보나치 수열의 10번째 항까지 합은:"+sum);

	}
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}else {
			return fibo(n-2)+fibo(n-1);
		}
	}

}
