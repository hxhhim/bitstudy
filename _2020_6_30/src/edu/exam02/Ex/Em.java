package edu.exam02.Ex;

import java.util.Scanner;

public class Em {

	public static void main(String[] args) {
		  Scanner stdln = new Scanner(System.in);

	      System.out.print("a: "); int a = stdln.nextInt();
	      System.out.print("b: "); int b = stdln.nextInt();
	      int c = 0;
	      if( a%2==0 ) c =  c + 1;
	      if( b%2==0 )  c = c + 1;
	      if( c == 0)
	         System.out.println("양쪽 모두 홀수 입니다.");
	      else if( c == 1 )
	         System.out.println("한쪽만 홀수 입니다.");
	      else if( c == 2 )
	         System.out.println("양쪽 모두 짝수 입니다.");
	   }
	}

	


/*a%2==0 짝수
  a%2!=0 홀수
  b%2==0 짝수
  b%2!=0 홀수

  a%2==0 && b%2==0 둘다 짝수
  a%2!=0 || b%2!=0
  a%2!=0 && b%2!=0 둘다 홀수
*/