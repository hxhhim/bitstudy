package edu.exam00.random10;

public class Random {

	public static void main(String[] args) {
		java.util.Random rd = new java.util.Random();
		for(int i =0; i < 5; i++) {
			int num = rd.nextInt(10);	//0~9
			System.out.println(num);
		}
		
	}

}
