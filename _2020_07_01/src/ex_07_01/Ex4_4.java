package ex_07_01;

import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ϼ���.");
		int a = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���.");
		int b = sc.nextInt();
		int c = Math.abs(a-b);
		for(int i = 1; i<c; i++) {
			if(a>b) {
				System.out.print(b+i+",");
			}else if(b>a){
				System.out.print(a+i+",");
			}
		}
		sc.close();	
	}

}
