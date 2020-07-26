package ex_07_01;

import java.util.Scanner;

public class Ex4_17 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("몇개의*을 표시할까요?:");
				int a = sc.nextInt();
				for(int i=0; i<a ; i++) {
					if(i%5==0) {
					System.out.print("\n");
					}
					System.out.print("*");
				}
		}		
	}

		

	


