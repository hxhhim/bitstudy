package ex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex6_4_1 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdln = new Scanner(System.in);
		
		System.out.print("¿ä¼Ò¼ö:");
		int n = stdln.nextInt();
		int[] a =new int[n];
		
		for(int i=0; i<n; i++)
			a[i] = 1+rand.nextInt(10);
		for(int i = 10;i>=1;i--) {
			for(int j=0;j<n;j++)
				if(a[j]>=i)
					System.out.print("* ");
				else
					System.out.print("  ");
			System.out.println();
		}
		for (int i=0; i<2*n;i++)
			System.out.print('-');
		System.out.println();
		for(int i=0; i<n;i++)
			System.out.print(i%10+" ");
		System.out.println();
		System.out.println(Arrays.toString(a));
	}

}
