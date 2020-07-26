package edu.exam00.transtype07;



public class CalcAvr {
	public static void main(String [] args) {
		int score0 = 99, score1 = 87, score2 = 77;
		int sum = 0;
		double avg = 0;
		
		sum = score0 + score1 + score2;
		
		avg = sum/3;
		System.out.println(sum);
		System.out.println(avg);
		avg = (double)sum/3;
		System.out.println(avg);
		System.out.printf("%.2f\n", avg);
	}
}
