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
	         System.out.println("���� ��� Ȧ�� �Դϴ�.");
	      else if( c == 1 )
	         System.out.println("���ʸ� Ȧ�� �Դϴ�.");
	      else if( c == 2 )
	         System.out.println("���� ��� ¦�� �Դϴ�.");
	   }
	}

	


/*a%2==0 ¦��
  a%2!=0 Ȧ��
  b%2==0 ¦��
  b%2!=0 Ȧ��

  a%2==0 && b%2==0 �Ѵ� ¦��
  a%2!=0 || b%2!=0
  a%2!=0 && b%2!=0 �Ѵ� Ȧ��
*/