package base;

import java.util.Scanner;

public class BaseBallMenu {
	private Scanner sc = new Scanner(System.in);
	private int[] speculation = new int[3];
	private DecisionBall db = new DecisionBall();
	private boolean regame;
	
	public void menu(int[] baseball) {
		while(true) {
			System.out.print("ù ��° ���� �Է� >> ");
			speculation[0] = sc.nextInt();
			System.out.print("�� ��° ���� �Է� >> ");
			speculation[1] = sc.nextInt();
			while(( speculation[1] == speculation[0])) {
				System.out.print("�� ��° ���� �Է� >> ");
				speculation[1] = sc.nextInt();
			}
			System.out.print("�� ��° ���� �Է� >> ");
			speculation[2] = sc.nextInt();
			while((speculation[2] == speculation[1]) || (speculation[2] == speculation[0])) {
				System.out.print("�� ��° ���� �Է� >> ");
				speculation[2] = sc.nextInt();
			}
			
			regame = db.decision(baseball, speculation);
			if(regame)
				break;
		}
	}
}
