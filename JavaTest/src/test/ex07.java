package test;
//10������ �Է¹޾� 2������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class ex07 {
	public void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("10������ �Է¹޾� 2������ ��ȯ�մϴ�.");
//		System.out.println("���ڸ� �Է��ϼ���");
//		int ten= Integer.parseInt(sc.nextLine());
		
		System.out.println("case4(1): " + intToBinaryCase4(5,4)); 
		System.out.println("case4(2): " + Integer.toString(5,2));

		
	}
	public static String intToBinaryCase4(int n, int sq) throws Exception { 
		double pow = Math.pow(2, sq); 
		StringBuilder binary = new StringBuilder(); 
		if (pow < n) { 
			throw new Exception("The length must be big from number."); 
		} 
		int shift = sq - 1; 
		for (; shift >= 0; shift--) { 
			int bit = (n >> shift) & 1; 
		if (bit == 1) { 
			binary.append("1"); 
		} else { 
			binary.append("0"); 
			} 
		} return binary.toString(); 
		}

	
}
