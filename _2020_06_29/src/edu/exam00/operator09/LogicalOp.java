package edu.exam00.operator09;

public class LogicalOp {

	public static void main(String[] args) {
		System.out.println(true && false);
		System.out.println(true && true); //���ʿ� false�� ����, ���ʺ��� �Ǵ��ϱ⶧����
		
		System.out.println(true || false);
		System.out.println(true || true); //���ʿ� true�� ����
		
		int salay = 300, duty = 7;
		if( salay <= 290 || duty >=5) {
			System.out.println("�Ի��ҰԿ�.");
			
		}
		
	}

}
