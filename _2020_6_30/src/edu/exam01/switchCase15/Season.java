package edu.exam01.switchCase15;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �ѱ۷� �Է�:");
		String season = sc.next();
		
		switch(season) {
		case "��":
			System.out.println("Spring");
			break;
		case "����":
			System.out.println("Summer");
			break;
		case "����":
			System.out.println("Autumn");
			break;
		case "�ܿ�":
			System.out.println("Winter");
			break;
		default:
			System.out.println("�ش���� ����");
		}

	}

}
