package edu.exam03.method03;

import java.util.Scanner;

public class Method {
	
	
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int[] arr; int cnt;		
		System.out.print("��� �Է��Ͻǰǰ���?");
		cnt =  sc.nextInt();
		arr = new int[cnt];
		
		for(int i=0; i<cnt;i++) {
		System.out.println("���ڸ� �Է�: ");
		arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static void output(int result) {
		System.out.println("���� "+ result);
	}
	public static int add(int[] ar) {
        int sum =0;
		for(int i=0; i<ar.length;i++)
			sum = sum +ar[i];
		  return sum;
	}
	public static void main(String[] args) {
		int result;
		int[] arr;
		arr = input();
		result = add(arr);
		output(result);


/*public class Method {
	public static int num0 = 0;
	public static int num1 = 0;
	
	public static void add() {
        
		int result =  num0 + num1;
		System.out.println("���� "+ result);
	}
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է�: ");
		num0 = sc.nextInt();
		System.out.println("���ڸ� �Է�: ");
		num1 = sc.nextInt();
		 
	}
	
	public static void main(String[] args) {
		
		input();
		add();
		
		
		*/

		
		
/*		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է�: ");
		int num0 = sc.nextInt();
		System.out.println("���ڸ� �Է�: ");
		int num1 = sc.nextInt();
		int result =  num0 + num1;
		System.out.println("���� "+ result);
		
		System.out.println("���ڸ� �Է�: ");
		num0 = sc.nextInt();
		System.out.println("���ڸ� �Է�: ");
		num1 = sc.nextInt();
		result =  num0 + num1;
		System.out.println("���� "+ result);
	*/	
	}

}
