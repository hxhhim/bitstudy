package edu.exam03.method03;

import java.util.Scanner;

public class Method {
	
	
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		int[] arr; int cnt;		
		System.out.print("몇개를 입력하실건가요?");
		cnt =  sc.nextInt();
		arr = new int[cnt];
		
		for(int i=0; i<cnt;i++) {
		System.out.println("숫자를 입력: ");
		arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static void output(int result) {
		System.out.println("합은 "+ result);
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
		System.out.println("합은 "+ result);
	}
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력: ");
		num0 = sc.nextInt();
		System.out.println("숫자를 입력: ");
		num1 = sc.nextInt();
		 
	}
	
	public static void main(String[] args) {
		
		input();
		add();
		
		
		*/

		
		
/*		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력: ");
		int num0 = sc.nextInt();
		System.out.println("숫자를 입력: ");
		int num1 = sc.nextInt();
		int result =  num0 + num1;
		System.out.println("합은 "+ result);
		
		System.out.println("숫자를 입력: ");
		num0 = sc.nextInt();
		System.out.println("숫자를 입력: ");
		num1 = sc.nextInt();
		result =  num0 + num1;
		System.out.println("합은 "+ result);
	*/	
	}

}
