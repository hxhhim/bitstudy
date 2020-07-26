package edu.exam01.switchCase15;

public class ForLoop {

	public static void main(String[] args) {
		
		
		int num = 1;
		
/*		
		while(num > 0) {
		System.out.println(num--);
		//num--;
		}*/
//		for (초기화; 조건식; 증감)
/*		for(num=3;num>0;num--) {
			System.out.println(num);
		}*/
		int sum = 0;
		while(num<101) {
			sum =sum+num;
			num++;
		}
		System.out.println("1~100의합은:"+sum);
		
		int sum1 = 0; 
		for(int num1=1; num1<101; num1++) {
			sum1 = sum1+num1;
		}
		System.out.println(sum1);
	}
}