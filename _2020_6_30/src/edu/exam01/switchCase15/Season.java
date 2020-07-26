package edu.exam01.switchCase15;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계절을 한글로 입력:");
		String season = sc.next();
		
		switch(season) {
		case "봄":
			System.out.println("Spring");
			break;
		case "여름":
			System.out.println("Summer");
			break;
		case "가을":
			System.out.println("Autumn");
			break;
		case "겨울":
			System.out.println("Winter");
			break;
		default:
			System.out.println("해당사항 없음");
		}

	}

}
