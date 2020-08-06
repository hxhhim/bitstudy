package test;
import java.util.Scanner;

//양의 정수를 입력받아 약수를 구해 출력하는 프로그램을 작성하시오.

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean input = true;
		int num=0;
				
		while(input) {
			System.out.println("정수값을 입력하세요:");
			num = Integer.parseInt(sc.nextLine());
			if(num<=0) {
				System.out.println("양의 정수값을 입력해주세요.");
			}else {
				input=false;
			}
		}
		System.out.print(num+"의 약수는: ");
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("입니다.");
		
		

	}

}
