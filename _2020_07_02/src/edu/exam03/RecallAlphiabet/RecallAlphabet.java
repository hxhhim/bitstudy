package edu.exam03.RecallAlphiabet;

public class RecallAlphabet {
	public static void recallAlphabet(char[] arr, int len) {
		
		for(int i=0; i<len; i++)
			System.out.print(arr[i]);
		System.out.println();
		
		if(len ==1)
			return;
		else
			recallAlphabet(arr,--len);
		
		for(int i=0; i<len; i++)
			System.out.print(arr[i]);
		System.out.println();

	}
	
	
	public static void main(String[] args) {
//		char[]  alpha = {'a', 'b','c','d','e','f'};
		String strAlpha="abcdef";
		char[] alpha = strAlpha.toCharArray();
		
		recallAlphabet(alpha,alpha.length);

	}

}
