package ex_07_01;

public class Ex4_26 {

	public static void main(String[] args) {
		java.util.Scanner stdln = new java.util.Scanner(System.in);
		System.out.println("������ �� �մϴ�.");
		System.out.print("��� ���ұ��?:");
		
		int n = stdln.nextInt();
		int sum = 0;
		int i;
		for(i =0;i<n;i++) {		//�Է¹��� n������ �ݺ�
			System.out.print("����(0���� ����):");
				int t = stdln.nextInt();
				if(t==0)break;  //0�� �Է¹����� ����
				sum += t;
		}
		System.out.println("�հ�� "+ sum +"�Դϴ�.");
		if(i!=0)
			System.out.println("�����"+ sum/i +"�Դϴ�.");
	}

}
