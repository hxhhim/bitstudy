package test;
import java.util.Scanner;

//�� ���� �Է¹޾� �μ��� �ִ������� �ּ� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�����: �ΰ� �̻��� �ڿ����� ������ ���
//�ִ� �����: ����� �߿��� ���� ū��
//�����: �ΰ� �̻��� �ڿ����� ������ ���
//�ּ� �����: ����� �߿��� ���� ������
//��Ŭ����ȣ����:�־��� �μ� ���̿� �����ϴ� �ִ� �����(GDC)�� ���ϴ� �˰���
//�ּҰ����*�ִ�����=a*b ����
public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int a=0;
	    int b=0;
		int temp=0;
				
		System.out.println("�ִ������� �ּҰ������ ���غ��ô�.");
		while(true) {
		    while(true) {
				System.out.println("ù��° ������ �Է��ϼ���.");
			    a = Integer.parseInt(sc.nextLine());
			    if(a>0)
			    	break;
			    }
		    while(true) {
			    System.out.println("�ι�° ������ �Է��ϼ���.");
			    b = Integer.parseInt(sc.nextLine());
			    if(b>0)
			    	break;
			    }
		    if(a!=b) {
		    	break;
		    }else {
		    	System.out.println("�Է��� �μ��� �����ϴ�. �ٽ��Է����ּ���.");
		    }
		}
	    if(a>b) {
	    	
	    }else{
	    	temp=a;
	    	a=b;
	    	b=temp;
	    }
	    System.out.println("�ִ������� "+gcd(a,b)+"�Դϴ�.");
	    System.out.println("�ּҰ������ "+lcm(a,b)+"�Դϴ�.");
	    
	    
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
