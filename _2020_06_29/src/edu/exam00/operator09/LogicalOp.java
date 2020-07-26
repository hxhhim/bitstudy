package edu.exam00.operator09;

public class LogicalOp {

	public static void main(String[] args) {
		System.out.println(true && false);
		System.out.println(true && true); //왼쪽에 false가 빠름, 왼쪽부터 판단하기때문에
		
		System.out.println(true || false);
		System.out.println(true || true); //왼쪽에 true가 빠름
		
		int salay = 300, duty = 7;
		if( salay <= 290 || duty >=5) {
			System.out.println("입사할게요.");
			
		}
		
	}

}
