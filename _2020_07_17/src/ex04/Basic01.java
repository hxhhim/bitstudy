package ex04;

/*
 * ����ڰ� 0�� �Է��ϱ� ������ ������ �Է��ؼ� ����ϴ�
 * �޼��带 �����ϰ� ����ϼ���
 * void printInputNums();
 	//����ڿ��� ���� �Է�
	//�Է¹��� ���� ���
	//0�Է¹ޱ� ������ �ݺ�

 */

public class Basic01 {
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	
	public static void main(String[] args) {
	
		printInputNums();
	
	}
	public static void printInputNums() {
		while(true) {
			System.out.println("������ �Է��ϼ���.");
			int num = sc.nextInt();
			if(num==0) {
				System.out.println("�Է��� �����մϴ�.");
				break;
			}
			System.out.println("�Է�������:"+num);
			
	}
   }
}
