package edu.exam03.recall15;

/*
 * ÆÑÅä¸®¾ó
 * 5! = 5x4x3x2x1
 * Àç±ÍÇÔ¼ö
 */
public class Recall {
	
	public static int factorial(int n) {
		int ret=1;
		for(int i=2 ; i<n+1;i++) {
			ret = ret*i;
		}
		return ret;
	}
	public static int fact(int n) {
		if(n ==1)
			return 1;
		else
			return n*fact(n-1);
		
	}
	/*	public static void factorial(int a) {
		int a;
		int num;
		int sum =1 ;
		for(int i=0;i<num; i++ ) {
			sum = sum*num;
			
		} */
		
	
	public static void main(String[] args) {
		int ret;
		ret = factorial(5);
		ret = fact(5);
		System.out.println("5! : "+factorial(5));

	}

}
