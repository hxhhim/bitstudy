package ex_07_01;

public class Ex4_25 {

	public static void main(String[] args) {
		java.util.Scanner stdln = new java.util.Scanner(System.in);
		
		int n;
		do {
			System.out.print("2이상의 정수값: ");
				n = stdln.nextInt();
		}while(n<2);
		
		int i;
		for(i=2;i<n;i++) { //나누어서 나머지가 없는 수를 찾는다.
			if(n%i==0)
				break;
		}
		if(i==n)
			System.out.println("소수입니다.");//나누어서 나머지가 없는 수가 입력한 수이면 소수
		else
			System.out.println("소수가 아닙니다.");
		

	}

}
