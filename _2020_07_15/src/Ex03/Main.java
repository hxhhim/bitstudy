package Ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String in;
		A t= null;
		System.out.print("1.���� 2.�׸�:");
		in = sc.nextLine();
		switch(in) {
		case"1":
			t = new B();
			break;
		case"2":
			t= new C();
			break;
		default:
			System.out.println("�ش���� ����");
		}
		
		t.Draw();
	
	}

}
