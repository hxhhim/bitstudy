package ex_07_01;

public class Ex4_24 {

	public static void main(String[] args) {
		java.util.Scanner stdln = new java.util.Scanner(System.in);
		
		System.out.println("피라미드를 표시합니다.");
		System.out.print("단수는?:");
		int n = stdln.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
				System.out.print(' ');
		    for(int j=1;j<=2*i-1;j++)
			    System.out.print(i%10);//10자리 이상일때 한자리수로 출력하기 위해서
		  System.out.println();
				
		  
		
		
		}
	}

}
