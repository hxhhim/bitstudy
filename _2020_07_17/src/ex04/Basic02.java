package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    사용자가 0을 입력하기 전까지 정수를 입력해서 반환하는
    메서드를 정의하고 사용하세요
  int[] getInputNums();
  	
  	사용자에게 정수를 입력받음
  	입력받은 정수를 int[]에 저장하고
  	0을 입력받으면 배열로 출력
 */

public class Basic02 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
				
		getInputNums();
	}
	
	public static void getInputNums() {
		ArrayList<Integer> nums = new ArrayList<>();
		while(true) {
			System.out.println("정수를 입력하세요.");
			int num = sc.nextInt();
			if(num==0) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			nums.add(num);
		}
		for(Integer n :nums) {
			System.out.print(n+" ");
		}
	}

}
