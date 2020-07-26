package edu.exam01.continue16;

public class Continue {

	public static void main(String[] args) {
		//1부터 10까지 2의 배수를 출력
		
		
		for(int i =2;  i<=10; i = i +2) {
 			System.out.print(i+ ".");		
		}
		
		System.out.println();
		
		for(int i=1; i<11; i++) {
			if(i%2==0) {
				System.out.print(i+",");
			}
		}
		System.out.println();
	
		for(int i=1; i<11; i++) {
			if(i%2!=0) 
				continue;//증강쪽으로 바로 이동
				System.out.print(i+",");
			}
		}
	
	
	}
		


