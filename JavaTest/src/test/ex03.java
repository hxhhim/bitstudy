package test;
import java.util.Scanner;

//���� ������ �Է¹޾� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean input = true;
		int num=0;
				
		while(input) {
			System.out.println("�������� �Է��ϼ���:");
			num = Integer.parseInt(sc.nextLine());
			if(num<=0) {
				System.out.println("���� �������� �Է����ּ���.");
			}else {
				input=false;
			}
		}
		System.out.print(num+"�� �����: ");
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("�Դϴ�.");
		
		

	}

}
