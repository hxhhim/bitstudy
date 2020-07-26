package edu.exam00.operator09;

public class CompareOp {

	public static void main(String[] args) {
		int x = 10,	y = 20;
		boolean r = x == y;
		
		System.out.println(r);
		r = x != y;
		System.out.println(r);
//		System.out.println(x > y);
		r = x > y;
		System.out.println(r);
		
		System.out.println(x < y);		//¿ÞÂÊÀÌ ±âÁØ
		System.out.println(x >= y);
		System.out.println(x <= y);
		System.out.println(!true);
		System.out.println(!false);  
	}

}
