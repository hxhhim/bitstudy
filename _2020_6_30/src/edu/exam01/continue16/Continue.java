package edu.exam01.continue16;

public class Continue {

	public static void main(String[] args) {
		//1���� 10���� 2�� ����� ���
		
		
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
				continue;//���������� �ٷ� �̵�
				System.out.print(i+",");
			}
		}
	
	
	}
		


