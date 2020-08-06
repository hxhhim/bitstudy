package test;
import java.util.Scanner;

//두 수를 입력받아 두수의 최대공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
//공약수: 두개 이상의 자연수의 공통인 약수
//최대 공약수: 공약수 중에서 가장 큰수
//공배수: 두개 이상의 자연수의 공통인 배수
//최소 공배수: 공배수 중에서 가장 작은수
//유클리드호제법:주어진 두수 사이에 존재하는 최대 공약수(GDC)를 구하는 알고리즘
//최소공배수*최대공약수=a*b 공식
public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a=0;
	    int b=0;
		int temp=0;
				
		System.out.println("최대공약수와 최소공배수를 구해봅시다.");
		while(true) {
		    while(true) {
				System.out.println("첫번째 정수를 입력하세요.");
			    a = Integer.parseInt(sc.nextLine());
			    if(a>0)
			    	break;
			    }
		    while(true) {
			    System.out.println("두번째 정수를 입력하세요.");
			    b = Integer.parseInt(sc.nextLine());
			    if(b>0)
			    	break;
			    }
		    if(a!=b) {
		    	break;
		    }else {
		    	System.out.println("입력한 두수가 같습니다. 다시입력해주세요.");
		    }
		}
	    if(a>b) {
	    	
	    }else{
	    	temp=a;
	    	a=b;
	    	b=temp;
	    }
	    System.out.println("최대공약수는 "+gcd(a,b)+"입니다.");
	    System.out.println("최소공배수는 "+lcm(a,b)+"입니다.");
	    
	    
	}
	public static int gcd(int a, int b) {
		while(b>0) {
			int temp = b;
			b = a % b;
			a = temp; 
		}
		return a;
	}
	public static int lcm(int a, int b) {
		return (a*b)/gcd(a,b);
	}

}
