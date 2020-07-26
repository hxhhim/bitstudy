package edu.exam02.Ex;

import java.util.Random;

public class Ex3_18 {

	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(3);
		switch(a) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		}
		
			

	}

}
