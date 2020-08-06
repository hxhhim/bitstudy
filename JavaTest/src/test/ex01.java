package test;
import java.math.BigInteger;
import java.util.Scanner;

//정수값을 입력받아서 입력받은 수의 팩토리얼 값을 구하는 프로그램을 작성하시오.
public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
				
		while(true) {
			System.out.println("정수값을 입력하세요:");
			num = Integer.parseInt(sc.nextLine());
			if(num<=0) {
				System.out.println("양의 정수값을 입력해주세요.");
			}else {
				break;
			}
		}
			
		System.out.println("입력한 "+num+"의 팩토리얼 값은 "+fact1(num)+"입니다.");
		sc.close();
		
	}
	public static BigInteger fact1(int num) {
		BigInteger fac = BigInteger.ONE;
		for(int i=1;i<=num;i++) {
			fac=fac.multiply(BigInteger.valueOf(i));
		}
		return fac;
		
			
		
	}
	//재귀사용 long으로는 결과값을 담기 어려움.
	public static long fact(long num) {
		
		
		if(num<=1) {
			return num;
		}else {
			return fact(num-1)*num;
		}
	}

}
