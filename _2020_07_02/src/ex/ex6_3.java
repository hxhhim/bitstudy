package ex;

import java.util.Arrays;

public class ex6_3 {

	public static void main(String[] args) {
/*		double[] db = new double[5];
		
		for(int i=0;i<db.length;i++) {
			double a = 1.1;
			db[i]= a*(i+1);
			}
		System.out.print(Arrays.toString(db));
*/	
		double[] a =new double[5];
		
		for(int i=0;i<a.length; i++)
			a[i] = (i+1)*1.1;
		
		for(int i=0; i<a.length; i++)
			System.out.printf("a[%d] = %f%n",i,a[i]);
		System.out.print(Arrays.toString(a));//출력방식의 차이
		
	}
}
