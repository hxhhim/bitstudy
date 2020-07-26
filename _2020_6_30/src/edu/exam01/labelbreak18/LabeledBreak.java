package edu.exam01.labelbreak18;

public class LabeledBreak {

	public static void main(String[] args) {
		int k = 3;
//		outerLoop:
		boolean isStop = false;
			for (int i =1; i<10;i++) {
				for(int j=1;j<10;j++) {
					System.out.printf("[%d,%d]",i,j);
					if (i%2==0 && j%2 ==0) {
//						break outerLoop;//for문 밖으로 빠져나옴 outerLoop위치로
						isStop = true;
						break;
					}
				
			}
				if(isStop)//나가기전에 확인
					break;
				System.out.println();
		}
		
		System.out.println();
	}
}