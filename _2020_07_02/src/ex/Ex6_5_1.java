package ex;

import java.util.Scanner;

public class Ex6_5_1 {

	public static void main(String[] args) {
		 Scanner stdln = new Scanner(System.in);
		 
		 System.out.print("사람 수:");
		 int n = stdln.nextInt();
		 int[] points = new int[n];
		 
		 System.out.println("점수를 입력하세요.");
		 int sum = 0;
		 for(int i=0; i<n;i++) {
			 System.out.print((i+1)+"번의 점수:");
		 	 points[i] = stdln.nextInt();
		 	 sum += points[i];
		 }
		 
		 int max = points[0];
		 int min = points[0];
		 
		 for(int i =1; i<n; i++) {
			 if(points[i]>max)max =points[i]; //하나씩 비교해서 큰값을 max에 계속 옮김
			 if(points[i]<min)min =points[i]; //하나씩 비교해서 작은값을 min에 계속 옮김
		 }
		 System.out.println("합계는 " + sum +"점입니다.");
		 System.out.println("평균은 " + (double)sum/n+"점입니다.");
		 System.out.println("최고점은 "+ max + "점입니다.");
		 System.out.println("최저점은 "+ min + "점입니다.");
	}

}
