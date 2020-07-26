package base;

import java.util.Scanner;

public class DecisionBall {
	private int s;
	private int b;
	private boolean regame = true;
	private Scanner sc = new Scanner(System.in);
	
	public boolean decision(int[] baseball, int[] speculation) {
		s = 0;
		b = 0;

		for (int i = 0; i < baseball.length; i++) {
			for (int j = 0; j < speculation.length; j++) {
				if(i == j && baseball[i] == speculation[j])
					++s;
				else if(i != j && baseball[i] == speculation[j])
					++b;
			}
		}
		if(s < 3) {
			System.out.println("==> "+s+"스트라이크 "+b+"볼");
		}
		else {
			System.out.println("==> "+s+"스트라이크 ");
			System.out.println("삼진아웃!!");
			System.out.println();
			System.out.print("다시 하시겠습니까(Y/N)?");
			if(sc.next().charAt(0) == 'n' && sc.next().charAt(0) == 'N')
				regame = false;
		}
		return regame;
	}
}
