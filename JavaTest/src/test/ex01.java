package test;
import java.math.BigInteger;
import java.util.Scanner;

//�������� �Է¹޾Ƽ� �Է¹��� ���� ���丮�� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
				
		while(true) {
			System.out.println("�������� �Է��ϼ���:");
			num = Integer.parseInt(sc.nextLine());
			if(num<=0) {
				System.out.println("���� �������� �Է����ּ���.");
			}else {
				break;
			}
		}
			
		System.out.println("�Է��� "+num+"�� ���丮�� ���� "+fact1(num)+"�Դϴ�.");
		sc.close();
		
	}
	public static BigInteger fact1(int num) {
		BigInteger fac = BigInteger.ONE;
		for(int i=1;i<=num;i++) {
			fac=fac.multiply(BigInteger.valueOf(i));
		}
		return fac;
		
			
		
	}
	//��ͻ�� long���δ� ������� ��� �����.
	public static long fact(long num) {
		
		
		if(num<=1) {
			return num;
		}else {
			return fact(num-1)*num;
		}
	}

}
