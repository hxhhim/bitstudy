package ex_07_01;

public class Ex4_25 {

	public static void main(String[] args) {
		java.util.Scanner stdln = new java.util.Scanner(System.in);
		
		int n;
		do {
			System.out.print("2�̻��� ������: ");
				n = stdln.nextInt();
		}while(n<2);
		
		int i;
		for(i=2;i<n;i++) { //����� �������� ���� ���� ã�´�.
			if(n%i==0)
				break;
		}
		if(i==n)
			System.out.println("�Ҽ��Դϴ�.");//����� �������� ���� ���� �Է��� ���̸� �Ҽ�
		else
			System.out.println("�Ҽ��� �ƴմϴ�.");
		

	}

}
