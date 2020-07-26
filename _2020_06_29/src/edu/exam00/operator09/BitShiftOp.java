package edu.exam00.operator09;

public class BitShiftOp {
	
	public static void main(String[] args) {
		byte x = -2; //00001010
		
		
		System.out.println(x >>> 1 );
		System.out.println(x >> 1);
		System.out.println(x << 1);   //00001010 << 1
		System.out.println(x << 2);
		System.out.println(x << 3);
		System.out.println();
		System.out.println(x >> 1);
		System.out.println(x >> 2);
		System.out.println(x >> 3);		
		
		
	}
}
