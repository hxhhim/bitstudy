package ex;


import java.util.Scanner;

public class ex6_6 {

	public static void main(String[] args) {
		int[] arr = {22,57,11,32,91,32,70};
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<7;i++) {
			System.out.printf("arr[%d]=%d\n",i,arr[i]);
		}
		System.out.println("찾을숫자:");
		int x =sc.nextInt();
		for(int i =arr.length-1; i>-1;i--){
			if(arr[i]==x) {
				System.out.printf("그값은 arr[%d]에 있습니다.",i);
				return;
			
		}
	}

 }
}
