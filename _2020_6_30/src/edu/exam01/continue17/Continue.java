package edu.exam01.continue17;

/*
 * 2X1 =2 2X2=4....2X9=18
 * 3X1 =3 3X2=6....3X9=27
 * ...
 * 9X1 =9 9x2=18....9x9x=81
 * 
 */
public class Continue {

	public static void main(String[] args) {
		
	for(int i=2; i<=9;i++) {
		if(i==5)
			continue;
		for(int j = 1; j<=9; j++) {
			if(i==5)
				continue;
			System.out.printf("%dX%d=%d\t", i,j,i*j);	
		}
		
	System.out.println();
	}	
}
}