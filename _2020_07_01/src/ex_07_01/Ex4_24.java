package ex_07_01;

public class Ex4_24 {

	public static void main(String[] args) {
		java.util.Scanner stdln = new java.util.Scanner(System.in);
		
		System.out.println("�Ƕ�̵带 ǥ���մϴ�.");
		System.out.print("�ܼ���?:");
		int n = stdln.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
				System.out.print(' ');
		    for(int j=1;j<=2*i-1;j++)
			    System.out.print(i%10);//10�ڸ� �̻��϶� ���ڸ����� ����ϱ� ���ؼ�
		  System.out.println();
				
		  
		
		
		}
	}

}
